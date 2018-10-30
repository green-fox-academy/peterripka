import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner input = new Scanner(System.in);
        System.out.println("Please, provide a number!");
        Scanner csillag = new Scanner(System.in);
        int height = csillag.nextInt();
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
