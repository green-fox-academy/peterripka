public class NumberAdder {

    public static void main(String[] args) {

        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        int addUpTo = 10;
        addingUp( addUpTo );
        System.out.println(addingUp(addUpTo));

    }

    private static int addingUp(int n) {
        if (n == 0) {
            return n;
        } else {
           return addingUp (n - 1)+n;
        }
    }
}

