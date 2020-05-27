package cs.fundamental.problems.leetcode.arraysandstrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubStringInSubStringTest {

    @ParameterizedTest
    @CsvSource(value = {"hello|ll|2"
            , "mini|rancho|-1"
            , "hellomini|mini|5"
            , "abcbcglx|bcgl|3"
            , "abcxabcdabxabcdabcdabcy|abcdabcy|15"
            , "||0"}, delimiter = '|')
    void strStr(String input1, String input2, String expected) {

        SubStringInSubString subject = new SubStringInSubString();

        // When
        int result = subject.strStr(input1, input2);

        // Then
        int expectedResult = Integer.valueOf(expected).intValue();
        assertEquals(expectedResult, result);
    }
}