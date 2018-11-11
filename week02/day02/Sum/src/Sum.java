import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number!");
        int enteredNr = scanner.nextInt();
        enteredNr++;
        System.out.println("The sum of the entered number and the numbers before it is: " + sum(enteredNr));
    }
    public static int sum(int givenNr) {
        int summa = 0;
        for (int i = 0; i < givenNr; i++) {
            summa += i;
        }
        return summa;
    }
}