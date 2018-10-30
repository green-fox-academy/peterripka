import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //

        Scanner input = new Scanner(System.in);
        System.out.println("Please, provide a number!");
        Scanner stars = new Scanner(System.in);
        int height = stars.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" "); }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* "); }
                    System.out.println();
        }
    }
}