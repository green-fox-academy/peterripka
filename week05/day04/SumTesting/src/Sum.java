import java.util.List;

public class Sum {


    private int sumList(List<Integer> numberList) {
        int sum = 0;
        for (Integer currentNumber : numberList) {
            sum += currentNumber;
        }
        return sum;
    }

    public int getSum(List<Integer> numberList) {
        return sumList( numberList );
    }
}
