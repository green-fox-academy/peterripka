package wanderer;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public abstract class Character {

    int maxHealthPoint;
    int maxDefensePoint;
    int maxStrikePoint;
    int currHealthPoint;
    int currDefensePoint;
    int currStrikePoint;
    int level;
    int strikeValue;
    int monsterStrikeValue;
    boolean isDead;
    BufferedImage image;
    int d6;
    int posX;
    int posY;
    String name;
    //max and current health point (HP), a defend (DP) and strike point (SP)


    public int getD6() {
        return (int) (Math.random() * 6) + 1;
    }


    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage( this.image, posX, posY, null );
        }
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void battle(Character character, KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            strike( character );
        }
    }

    public void strike(Character character) {
        int strikeValue = this.strikeValue + getD6() * 2;
        int monsterStrikeValue = character.currStrikePoint + getD6() * 2;

        if (this.currHealthPoint > 0 || character.currHealthPoint > 0) {
            if (strikeValue > character.currDefensePoint) {
                character.currHealthPoint = character.currHealthPoint - (strikeValue - character.currDefensePoint);
            }
            if (monsterStrikeValue > this.currDefensePoint) {
                this.currHealthPoint = this.currHealthPoint - (character.currStrikePoint - character.currDefensePoint);
            }
        }
    }

    public void setPosXY() {
        BoardArray boardArray = new BoardArray();
        int posXX = 3;
        int posYY = 0;
        while (boardArray.getBoardArray()[posYY][posXX] != 0 && boardArray.getBoardArray()[posYY][posXX] != boardArray.getBoardArray()[0][0]) {
            posXX = (int) (Math.random() * 9 + 1);
            posYY = (int) (Math.random() * 9);
        }
        this.posX = posXX * 72;
        this.posY = posYY * 72;
    }

    public int getPosX() {
        return posX;
    }
    public String getName() {
        return name;
    }

    public int getPosY() {
        return posY;
    }

    public int getCurrHealthPoint() {
        return currHealthPoint;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void goUp() {
        this.posY -= 72;
    }

    public void goDown() {
        this.posY += 72;
    }

    public void goLeft() {
        this.posX -= 72;
    }

    public void goRight() {
        this.posX += 72;

    }

    public String toString() {
        return getName()+ ':' +
                " HealthPoint = " + maxHealthPoint + "/" + currHealthPoint +
                ", DefensePoint = " + maxDefensePoint + "/" + currDefensePoint +
                ", StrikePoint = " + maxStrikePoint + "/" + currStrikePoint +
                ", Level = " + level;
    }
}

