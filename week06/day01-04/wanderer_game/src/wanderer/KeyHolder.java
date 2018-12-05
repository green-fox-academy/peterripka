package wanderer;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class KeyHolder extends Character {
    public KeyHolder() {
        this.level = 1;
        this.maxDefensePoint = level / 2 * getD6();
        this.maxHealthPoint = 2 * level * getD6() + 3;
        this.maxStrikePoint = level * getD6();
        currStrikePoint = maxStrikePoint;
        currDefensePoint = maxDefensePoint;
        currHealthPoint = maxHealthPoint;
        posY = 0;
        posX = 0;
        this.name = "Keyholder";
        try {
            this.image = ImageIO.read( new File( "img/keyholder.png" ) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

