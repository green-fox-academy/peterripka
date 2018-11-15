public class Refactorio {

    // Create a recursive function called `refactorio`
    // that returns it's input's factorial

    public static void main(String[] args) {

        int factorial = 5;
        System.out.println(reFactorio(factorial));

    }

    public static int reFactorio(int n) {
        System.out.println("n's value is " +n);
        if (n == 0) {
            return 1;
        } else {
            return n * reFactorio( n - 1 );
        }
    }
}