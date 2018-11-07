import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        int squareSize;
        Scanner scanner = new Scanner(System.in);
        String squareElement = "%";
        String squareSpace = " ";
        String SquareLine;

        System.out.println("Please, Enter a number: ");
        squareSize = scanner.nextInt();

        for (int i = 0; i < squareSize; i++) {
            SquareLine = "%";
            if (i == 0 || i == (squareSize - 1)) {
                for (int j = 1; j < squareSize; j++) {
                    SquareLine += squareElement;
                }
            } else {
                for (int j = 1; j < squareSize; j++) {
                    if (j == (squareSize - 1)) {
                        SquareLine += squareElement;
                    } else {
                        SquareLine += squareSpace;
                    }
                }
            }
            System.out.println(SquareLine);
        }

    }
}