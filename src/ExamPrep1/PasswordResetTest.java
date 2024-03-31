package ExamPrep1;

import ExamPrep1.PasswordReset;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordResetTest {

    @Test
    void testTakeOdd() {
        String input = "password";
        String expected = "asod";
        assertEquals(expected, PasswordReset.takeOddCharacters(input));
    }

    @Test
    void testCut() {
        String input = "password";
        String expected = "pasd";
        assertEquals(expected, PasswordReset.cutSubstring(input, 3, 4));
    }

    @Test
    void testCutWithInvalidIndex() {
        String input = "password";
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            PasswordReset.cutSubstring(input, 8, 4);
        });
    }

    @Test
    void testSubstitute() {
        String input = "password";
        String expected = "p*ssword";
        assertEquals(expected, PasswordReset.substituteSubstring(input, "a", "*"));
    }

    @Test
    void testSubstituteWithNonexistentSubstring() {
        String input = "password";
        String expected = "password";
        assertEquals(expected, PasswordReset.substituteSubstring(input, "x", "*"));
    }
}
