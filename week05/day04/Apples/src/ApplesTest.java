import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    Apples testApple = new Apples();

    @org.junit.jupiter.api.Test
    void getAppleTest() {
        assertEquals( "apple", testApple.getApple() );

    }

    @org.junit.jupiter.api.Test
    void getAppleTestFail() {
        assertEquals( "apples", testApple.getApple() );

    }
}