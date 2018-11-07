import java.util.Scanner;

public class PrintBigger{
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner nrreader = new Scanner(System.in);
        System.out.println("Please, enter your first number!");
        int a = nrreader.nextInt();

        System.out.println("Please, enter your second number!");
        int b = nrreader.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}