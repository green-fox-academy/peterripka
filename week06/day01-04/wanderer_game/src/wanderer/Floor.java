package wanderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Floor extends Tile {
    BufferedImage image;

    public Floor(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.isWalkable = true;
        try {
            image = ImageIO.read(new File( "img/floor.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image, posX, posY, null);
        }
    }
}
