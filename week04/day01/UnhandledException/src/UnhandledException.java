import java.util.Scanner;

public class UnhandledException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int divisor = scanner.nextInt();

        try { // Prevents the program breaking when attempting dividing by zero
            int result = 12 / divisor; // If the input value for divisor was 0 it stops the try block
            System.out.println(result); // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
        }
    }
}