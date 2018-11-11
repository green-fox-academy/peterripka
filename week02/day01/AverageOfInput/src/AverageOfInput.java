import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner numbers = new Scanner(System.in);

        System.out.println("Please, enter the first number!");
        int a = numbers.nextInt();

        System.out.println("Please, enter the second number!");
        int b = numbers.nextInt();

        System.out.println("Please, enter the third number!");
        int c = numbers.nextInt();

        System.out.println("Please, enter the fourth number!");
        int d = numbers.nextInt();

        System.out.println("Please, enter the fifth number!");
        int e = numbers.nextInt();

        int sum = (a + b + c + d + e);
        double s1 = sum;
        double average = s1 / 5;

        System.out.println("The total amount is " + sum + " and the average of the numbers is: " + average);
    }
}