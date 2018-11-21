public class GnirtsMain {

    public static void main(String[] args) {

        Gnirts g = new Gnirts( "example" );
        System.out.println( g.charAt( 1 ) );
        // should print out: l

        System.out.println( g.subSequence( 3, 5 ) );


        Shifter s = new Shifter( "example", 2 );
        System.out.println( s.charAt( 0 ) );
        // should print out: a
        System.out.println( s.subSequence( 3, 5 ) );

    }
}
