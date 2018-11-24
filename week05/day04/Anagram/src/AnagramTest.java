import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    public void anagramCheckerTest() {
        assertTrue(Anagram.anagramChecker("baseword", "baesword"));

    }
}