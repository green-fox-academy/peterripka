package wanderer;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

    public class Skeleton extends Character {
        public Skeleton() {
            this.level = 1;
            this.maxDefensePoint = level / 2 * getD6();
            this.maxHealthPoint = 2 * level * getD6();
            this.maxStrikePoint = level * getD6();
            currStrikePoint = maxStrikePoint;
            currDefensePoint = maxDefensePoint;
            currHealthPoint = maxHealthPoint;
            this.posY = 0;
            this.posX = 0;
            this.name = "Skeletor";
            try {
                this.image = ImageIO.read( new File( "img/skeleton.png" ) );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
