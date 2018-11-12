import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.

    public static final String PATH_OF_FILE = "my-file.txt";
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        Path filePath = Paths.get(PATH_OF_FILE);
        System.out.println("Please enter a word: ");
        String userString = userInput.nextLine();

        System.out.println("Please enter an integer: ");
        int userNumber = userInput.nextInt();
        writeMultiLines(filePath, userString, userNumber);

    }

    public static void writeMultiLines(Path filePath, String wordToWrite, int lines) {
        List<String> writeToFile = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            writeToFile.add(wordToWrite);
            try {
                Files.write(filePath, writeToFile);
            } catch (Exception exception) { }
        }
    }
}