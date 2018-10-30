import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner nrreader = new Scanner(System.in);
        System.out.println("Please, enter your number!");
        int num = nrreader.nextInt();

        if ((num % 2) == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number you entered is odd!");
        }
    }
}