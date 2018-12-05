package wanderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    public Hero() {
        this.level = 1;
        this.maxDefensePoint = 2 * getD6();
        this.maxHealthPoint = 20 + 3 * getD6();
        this.maxStrikePoint = 5 + getD6();
        currStrikePoint = maxStrikePoint;
        currDefensePoint = maxDefensePoint;
        currHealthPoint = maxHealthPoint;
        isDead = false;
        posX = 0;
        posY = 0;
        this.name = "Anduin";

        try {
            this.image = ImageIO.read( new File( "img/hero-down.png" ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setImage(String image) {
        try {
            this.image = ImageIO.read( new File( image ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void goUp() {
        setImage( "img/hero-up.png" );
        this.posY -= 72;
    }

    @Override
    public void goDown() {
        setImage( "img/hero-down.png" );
        this.posY += 72;
    }

    @Override
    public void goLeft() {
        setImage( "img/hero-left.png" );
        this.posX -= 72;
    }

    @Override
    public void goRight() {
        setImage( "img/hero-right.png" );
        this.posX += 72;

    }

    public void levelUp() {
        this.maxDefensePoint = this.maxDefensePoint + getD6();
        this.maxHealthPoint = this.maxHealthPoint + getD6();
        this.maxStrikePoint = this.maxStrikePoint + getD6();
    }

    @Override
    public String toString() {
        return this.name + ':' +
                " HealthPoint = " + maxHealthPoint + "/" + currHealthPoint +
                ", DefensePoint = " + maxDefensePoint + "/" + currDefensePoint +
                ", StrikePoint = " + maxStrikePoint + "/" + currStrikePoint +
                ", Level = " + level +
                " ( X = " + (1 + (posX / 72)) +
                "; Y = " + (1 + (posY / 72)) + ")";
    }
}

