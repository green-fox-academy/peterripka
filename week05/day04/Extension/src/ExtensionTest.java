import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test // works!
    void testAdd_2and3is5() {
        assertEquals(13, extension.add(10, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(14, extension.add(10, 4));
    }

    @Test //works!
    void testMaxOfThree_first() {
        assertEquals(15, extension.maxOfThree(15, 15, 4));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(15, extension.maxOfThree(12, 13, 15));
    }

    @Test
    void testMedian_four() {
        assertEquals(2, extension.median(Arrays.asList(7,1,3,2)));
    }

    @Test
    void testMedian_five() {
        assertEquals(5, extension.median(Arrays.asList(9,2,8,4,5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('A'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

    @Test
    void testTranslate_pici() {
        assertEquals("pivicivi", extension.translate("pici"));
    }
    @Test
    void testTranslate_roka() {
        assertEquals("rovokava", extension.translate("roka"));
    }

    @Test
    void testTranslate_izom() {
        assertEquals("ivizovom", extension.translate("izom"));
    }
}