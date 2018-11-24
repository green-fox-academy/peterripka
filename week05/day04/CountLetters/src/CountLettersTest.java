import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class CountLetterTest {

    private String testText;
    private HashMap<String, Integer> testMap;

    @Test
    void letterCounter() {
        testText = "spaghetteria";
        testMap = new HashMap<>();
        testMap.put( "s", 1 );
        testMap.put( "p", 1 );
        testMap.put( "a", 2 );
        testMap.put( "g", 1 );
        testMap.put( "h", 1 );
        testMap.put( "e", 2 );
        testMap.put( "t", 2 );
        testMap.put( "r", 1 );
        testMap.put( "i", 1 );
        assertEquals( testMap, CountLetters.letterCounter( testText ) );
    }
}