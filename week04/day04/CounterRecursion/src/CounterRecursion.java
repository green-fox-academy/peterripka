public class CounterRecursion {

    public static void main(String[] args) {

        // Write a recursive function that takes one parameter: n and counts down from n.
        int countDownFrom= 10;
        countDown(countDownFrom);
    }

    private static void countDown(int n){
        System.out.println(n);
        if (n == 0) {
            System.out.print("Ignition!");
            return;
        } else {
            countDown(n-1);
        }
    }
}
