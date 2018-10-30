import java.util.Scanner;

public class CountFromTo {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    public static void main(String[] args) {

        System.out.println("Enter the first number!");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();

        System.out.println("Enter the second number!");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int a = number1; a < number2; a++) {
                System.out.println(a);
            }

        }
    }
}