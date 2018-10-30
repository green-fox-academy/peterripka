import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your distance in kms!");
        double distance=input.nextDouble();
        double mileskms = distance / 1.60934;
        System.out.println("Your distance in miles is " + mileskms);
    }
}