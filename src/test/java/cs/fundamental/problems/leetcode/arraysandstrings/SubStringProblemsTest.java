package cs.fundamental.problems.leetcode.arraysandstrings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * * Possible Iterations is O(N)
 * 0	: p     - count 1
 * 1	: pw    - count 2
 * 2	: pww   - Repeat
 * 3	: pwwk   - Repeat
 * 4	: pwwke   - Repeat
 * 5	: pwwkew   - Repeat
 * 6	: w    - count 1
 * 7	: ww   - Repeat
 * 8	: wwk   - Repeat
 * 9	: wwke   - Repeat
 * 10	 : wwkew   - Repeat
 * 11	 : w    - count 1
 * 12	 : wk    - count 2
 * 13	 : wke    - count 3
 * 14	 : wkew   - Repeat
 * 15	 : k    - count 1
 * 16	 : ke    - count 2
 * 17	 : kew    - count 3
 * 18	 : e    - count 1
 * 19	 : ew    - count 2
 * 20	 : w    - count 1
 */
class SubStringProblemsTest {

    @ParameterizedTest
    @ValueSource(strings = {"pwwkew:3", "abcabcbb:3", "bbbbbb:1", ":0"})
    void lengthOfLongestSubstringBruteForce(String data) {
        String[] testData = data.split(":");
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.lengthOfLongestSubstringBruteForce(testData[0]);
        int expected = Integer.valueOf(testData[1]);
        assertEquals(expected, result);
    }


    @Test
    void lengthOfLongestSubstringBruteForceForNull() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.lengthOfLongestSubstringBruteForce(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pwwkew:3", "abcabcbb:3", "bbbbbb:1", ":0"})
    void lengthOfLongestSubstringNaive(String data) {
        String[] testData = data.split(":");
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.lengthOfLongestSubstringNaive(testData[0]);
        int expected = Integer.valueOf(testData[1]);
        assertEquals(expected, result);
    }


    @Test
    void lengthOfLongestSubstringNaiveForNull() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.lengthOfLongestSubstringNaive(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pwwkew:3", "abcabcbb:3", "bbbbbb:1", ":0"})
    void lengthOfLongestSubstring(String data) {
        String[] testData = data.split(":");
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.lengthOfLongestSubstring(testData[0]);
        int expected = Integer.valueOf(testData[1]);
        assertEquals(expected, result);
    }


    @Test
    void lengthOfLongestSubstringForNull() {
        SubStringProblems subStringProblems = new SubStringProblems();
        int result = subStringProblems.lengthOfLongestSubstring(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void convertStringToInteger() {
    }
}