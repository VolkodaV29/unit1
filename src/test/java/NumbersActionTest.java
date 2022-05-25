import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersActionTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test beginning.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }

    @Test
    void sum() {
        NumbersAction action1 = new NumbersAction();
        int actual = action1.sum(5);
        int expected = 15;
        assertEquals(actual, expected);
    }

    @Test
    void factorial() {
        NumbersAction action2 = new NumbersAction();
        int actual = action2.factorial(3);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    void gProgression() {
        NumbersAction action3 = new NumbersAction();
        double actual = action3.gProgression(2, 4, 6);
        double expected = 2730;
        assertEquals(actual, expected);
    }
}