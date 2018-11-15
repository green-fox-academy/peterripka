public class Power {

    public static void main(String[] args) {

        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        int baseNum = 111;
        int powerNum = 3;
        System.out.println( power( baseNum, powerNum ) );
    }

    private static int power(int baseNum, int n) {
        if (n == 1) {
            return baseNum;
        } else if (n == 0){
            return 1;
        } else {
            return baseNum * power( baseNum, n - 1 );
        }
    }
}
