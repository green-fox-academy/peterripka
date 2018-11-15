public class Bunny1 {

    public static void main(String[] args) {

        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

        int bunnies = 7;
        countingEars( bunnies );
        System.out.println( countingEars( bunnies ) );

    }

    private static int countingEars(int n) {
        int pairOfEars = 2;
        if (n == 1) {
            return pairOfEars;
        } else {
            return pairOfEars + countingEars( n - 1 );
        }
    }
}

