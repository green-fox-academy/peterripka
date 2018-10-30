import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8
        Scanner numbers = new Scanner(System.in);

        System.out.println("Please, enter your guess!");
        int a = numbers.nextInt();

        while (a != 8) {
          if (a > 8) {
            System.out.println("The stored number is lower.");
        } else if (a < 8) {
            System.out.println("The stored number is higher.");
        }
            System.out.println("Please, guess again!");
            a = numbers.nextInt();
        }
        System.out.println("You found the number! It is 8!");
    }
}
