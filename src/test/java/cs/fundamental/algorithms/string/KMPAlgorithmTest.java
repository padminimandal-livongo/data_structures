package cs.fundamental.algorithms.string;

import cs.fundamental.util.TestUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class KMPAlgorithmTest {

    @ParameterizedTest
    @CsvSource(value = {"abcaby|0,0,0,1,2,0"
            , "abcdabca|0,0,0,0,1,2,3,1"}, delimiter = '|')
    void prepPattern(String pattern, String expected) {
        KMPAlgorithm subject = new KMPAlgorithm();
        int[] result = subject.prepPattern(pattern);

        int[] expectedArray = TestUtil.getIntArray(expected);
        assertArrayEquals(expectedArray, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"abxabcabcaby|abcaby|6"
            , "abc|dd|-1"
            , "|d|0"
            , "hgn||0"
            , "ff|fff|0"
            , "||0"}, delimiter = '|')
    void containsPattern(String inputData, String pattern, int expected) {
        KMPAlgorithm subject = new KMPAlgorithm();

        int result = subject.containsPattern(inputData, pattern);

        assertEquals(expected, result);
    }
}