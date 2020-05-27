package cs.fundamental.problems.leetcode.arraysandstrings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @CsvSource(value = {"pwwkew:3", "abcabcbb:3", "bbbbbb:1", ":0"}, delimiter = ':')
    void bruteForce(String testData, String expected) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.bruteForce(testData);
        assertEquals(Integer.valueOf(expected), result);
    }


    @Test
    void bruteForceForNull() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.bruteForce(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"pwwkew:3", "abcabcbb:3", "bbbbbb:1", ":0"}, delimiter = ':')
    void naiveMethod(String data, String expected) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.naiveMethod(data);
        assertEquals(Integer.valueOf(expected), result);
    }


    @Test
    void naiveMethodForNull() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.naiveMethod(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pwwkew:3", "abcabcbb:3", "bbbbbb:1", ":0"})
    void lengthOfLongestSubstring(String data) {
        String[] testData = data.split(":");
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.pointerMethod(testData[0]);
        int expected = Integer.valueOf(testData[1]);
        assertEquals(expected, result);
    }


    @Test
    void lengthOfLongestSubstringForNull() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.pointerMethod(null);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void convertStringToInteger() {
    }
}