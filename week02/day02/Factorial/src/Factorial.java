import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int enteredNr = scanner.nextInt();
        System.out.println("The factorial of the entered number is: " + factorio(enteredNr));

    }

    public static int factorio(int givenNr) {
        int facto = 1;
        for (int i = givenNr; i > 0 ; i--) {
            facto *= i;
        }
        return facto;
    }
}