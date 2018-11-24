import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum objectOfSum = new Sum();
    List<Integer> listOfNumbers;


    @Test
    public void getSumTestWithEmptyList() {
        listOfNumbers = new ArrayList<>( Arrays.asList() );
        assertEquals( 0, objectOfSum.getSum( listOfNumbers ) );
    }

    @Test
    public void getSumTestWithOneNum() {
        listOfNumbers = new ArrayList<>( Arrays.asList( 7 ) );
        assertEquals( 7, objectOfSum.getSum( listOfNumbers ) );
    }

    @Test
    void getSumTestWithNums() {
        listOfNumbers = new ArrayList<>( Arrays.asList( 1, 5, 32, 3 ) );
        assertEquals( 41, objectOfSum.getSum( listOfNumbers ) );
    }

//    @Test // NullPointerException?
//    public void getSumTestWithNull() {
//        listOfNumbers = null;
//        assertEquals( null, objectOfSum.getSum( listOfNumbers ) );
//    }

    @Test
    void sumwithnull() {
        assertThrows( NullPointerException.class, () -> {
            objectOfSum.getSum( null );
        } );
    }
}