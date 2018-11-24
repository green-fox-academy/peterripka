import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTestingTest {


    @Test
    public void fibonacciTest() {
        assertEquals(3, FibonacciTesting.nthFibCalc(4));
    }

    @Test
    public void fibonacciTestBigNum() {
        assertEquals(987, FibonacciTesting.nthFibCalc(16));
    }

    @Test
    public void fibonacciZeroTest () {
        assertEquals(0, FibonacciTesting.nthFibCalc(0));
    }

    @Test //expected StackOverFlowError.class
    public void fibonacciNegTest() {
        System.out.println("You can NOT give negative numbers as input!");
        assertEquals(0, FibonacciTesting.nthFibCalc(-1));
    }
}
