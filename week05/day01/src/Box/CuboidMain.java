package Box;

public class CuboidMain {

    public static void main(String[] args) {
        Cuboid rubik = new Cuboid( 25, 10, 12 );
        System.out.println( rubik.getVolume() );
        System.out.println( rubik.getSurface() );
    }
}
