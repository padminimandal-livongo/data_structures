package cs.fundamental.problems.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoArrayProblemsTest {

    @Test
    void findCharString() {
        String text = "THIS IS A TEST TEXT";
        String pattern = "TEXT";

        TwoArrayProblems twoArrayProblems = new TwoArrayProblems();
        boolean result = twoArrayProblems.containsString(text.toCharArray(), pattern.toCharArray());

        assertTrue(result);
    }

    @Test
    void findCharString3() {
        String text = "TEST TEXT";
        String pattern = "TEXT";

        TwoArrayProblems twoArrayProblems = new TwoArrayProblems();
        boolean result = twoArrayProblems.containsString(text.toCharArray(), pattern.toCharArray());

        assertTrue(result);
    }

    @Test
    void findCharString2() {
        String text = "ksjhflidsjflkjkl";
        String pattern = "quiz";

        TwoArrayProblems twoArrayProblems = new TwoArrayProblems();
        boolean result = twoArrayProblems.containsString(text.toCharArray(), pattern.toCharArray());

        assertFalse(result);
    }
}