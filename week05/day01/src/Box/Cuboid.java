package Box;

public class Cuboid {

    // Create a class that represents a cuboid:
    // It should take its three dimensions as constructor parameters. For example: x: 5, y: 6, z: 15
    // It should have a method called `getSurface` that returns the cuboid's surface
    // It should have a method called `getVolume` that returns the cuboid's volume

    int xParam, yParam, zParam;

    public Cuboid(int xParam, int yParam, int zParam) {
        this.xParam = xParam;
        this.yParam = yParam;
        this.zParam = zParam;
    }

    public double getSurface() {
        return 2 * (xParam * yParam + xParam * zParam + yParam * zParam);
    }

    public double getVolume() {
        return xParam * yParam * zParam;
    }
}

