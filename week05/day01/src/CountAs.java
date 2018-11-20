import java.util.Scanner;

public class CountAs {
    public static void main(String[] args) {

        // Create a function that takes a string parameter,
        // counts the occurrences of the letter "a", and returns it as a number.

        // example: on the input "Apple" the function should return 1 - print this result
        // example: on the input "Avocado" the function should return 2 - print this result
        // example: on the input "Blueberry" the function should return 0 - print this result

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Please provide a string: " );
        String userInput = scanner.next();
        System.out.println( containsLetterA( userInput ) );

    }

    private static int containsLetterA(String userInput) {
        String example = userInput;
        int aCounter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt( i ) == 'a') {
                aCounter++;
            } else if (userInput.charAt( i ) == 'A') {
                aCounter++;
            }
        }
        return aCounter;
    }
}