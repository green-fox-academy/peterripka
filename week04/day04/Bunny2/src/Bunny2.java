public class Bunny2 {

    public static void main(String[] args) {

        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        int bunnies = 11;
        countingEars( bunnies );
        System.out.println( countingEars( bunnies ) );

    }

    private static int countingEars(int n) {
        int evenEars = 2;
        int oddEars = 3;
        if (n == 1) {
            return evenEars;
        } else if (n > 1 && n % 2 == 0) {
            return evenEars + countingEars( n - 1 );
        } else {
            return oddEars + countingEars( n - 1 );
        }
    }
}
