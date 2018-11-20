import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the original list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

        List<Integer> examInput = new ArrayList<>( Arrays.asList( 1, 2, 3, 4, 5 ) );
        List<Integer> examOutput = getSecondElements( examInput );

        System.out.println( examOutput.toString() );

    }

    private static List<Integer> getSecondElements(List<Integer> inputNums) {
        List<Integer> outputNums = new ArrayList<>();
        for (int i = 0; i < inputNums.size(); i++) {
            if (i % 2 != 0) {
                outputNums.add( inputNums.get( i ) );
            }
        }
        return outputNums;
    }
}
