public class SumDigit {

    public static void main(String[] args) {

        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        int num = 987654321;
        System.out.println( sumDigits( num ) );
    }

    private static int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return sumDigits( n / 10 ) + (n % 10);
        }
    }
}

