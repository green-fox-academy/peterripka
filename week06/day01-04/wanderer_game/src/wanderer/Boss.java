package wanderer;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Boss extends Character {

    public Boss() {
        this.level = 1;
        this.maxDefensePoint = level / 2 * getD6() + getD6() / 2;
        this.maxHealthPoint = 2 * level * getD6() + getD6();
        this.maxStrikePoint = level * getD6() + level;
        currStrikePoint = maxStrikePoint;
        currDefensePoint = maxDefensePoint;
        currHealthPoint = maxHealthPoint;
        this.posX = 0;
        this.posY = 0;
        this.name = "Noth (Boss)";
        try {
            this.image = ImageIO.read( new File( "img/boss.png" ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
