package cs.fundamental.problems.leetcode.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * * Possible Iterations is O(N)
 *      0	: p     - count 1
 *      1	: pw    - count 2
 *      2	: pww   - Repeat
 *      3	: pwwk   - Repeat
 *      4	: pwwke   - Repeat
 *      5	: pwwkew   - Repeat
 *      6	: w    - count 1
 *      7	: ww   - Repeat
 *      8	: wwk   - Repeat
 *      9	: wwke   - Repeat
 *      10	 : wwkew   - Repeat
 *      11	 : w    - count 1
 *      12	 : wk    - count 2
 *      13	 : wke    - count 3
 *      14	 : wkew   - Repeat
 *      15	 : k    - count 1
 *      16	 : ke    - count 2
 *      17	 : kew    - count 3
 *      18	 : e    - count 1
 *      19	 : ew    - count 2
 *      20	 : w    - count 1
 */
class SubStringProblemsTest {

    @Test
    void longestSubstringWithoutRepeatingCharacters() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersBruteForce("pwwkew");
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharacters2() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersBruteForce("abcabcbb");
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharacters3() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersBruteForce("bbbbbb");
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharacters4() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersBruteForce(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharacters5() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersBruteForce("");
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersOptimize1() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersOptimize1("pwwkew");
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersOptimize12() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersOptimize1("abcabcbb");
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersOptimize13() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersOptimize1("bbbbbb");
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersOptimize14() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersOptimize1(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersOptimize15() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.longestSubstringWithoutRepeatingCharactersOptimize1("");
        int expected = 0;
        assertEquals(expected, result);
    }
}