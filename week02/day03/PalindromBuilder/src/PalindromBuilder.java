import java.util.Arrays;
import java.util.Scanner;

public class PalindromBuilder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word or a number:");

        String userWord = userInput.nextLine();
        String[] wordArray = userWord.split("");
        String[] palindromeWordArray = Arrays.copyOf(wordArray, wordArray.length * 2);
        String palindrome = "";

        int whereToPut = palindromeWordArray.length - 1;
        for (String currentElement : wordArray) {
            palindromeWordArray[whereToPut] = currentElement;
            whereToPut--;

        }
        for (String currentChar : palindromeWordArray) {
            palindrome += currentChar;
        }
        System.out.println(palindrome);
    }
}