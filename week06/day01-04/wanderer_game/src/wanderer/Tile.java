package wanderer;

import java.awt.*;

public abstract class Tile {
    int posX;
    int posY;
    boolean isWalkable;

    public Tile(int posX, int poxY, boolean isWalkable) {
        this.posX = posX;
        this.posY = poxY;
        this.isWalkable = isWalkable;
    }

    public abstract void draw(Graphics g);

    public Tile() {
    }
}
