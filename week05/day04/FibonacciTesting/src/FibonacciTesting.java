

public class FibonacciTesting {

    public static int nthFibCalc(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return nthFibCalc( n - 1 ) + nthFibCalc( n - 2 );
        }
    }
}