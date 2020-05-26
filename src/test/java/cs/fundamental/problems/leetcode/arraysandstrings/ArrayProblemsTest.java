package cs.fundamental.problems.leetcode.arraysandstrings;

import cs.fundamental.util.TestUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProblemsTest {

    @ParameterizedTest
    @CsvSource(value = {"1,8,6,2,5,4,8,3,7|49"
            , "3,9,3,4,7,2,12,6|45"
            , "3,3|3"
            , "3,3,4|6"
            , "3,4,3|6"
            , "4,3,4|8"
            , "4,0,4|8"
            , "|0"
            , "0,0,0|0"
            , ",|0"}, delimiter = '|')
    void maxAreaBetweenTwoVerticalLinesBruteForce(String inputDataStrings, String expected) {
        ArrayProblems subject = new ArrayProblems();

        // Given
        int[] input = TestUtil.getIntArray(inputDataStrings);

        // When
        int result = subject.maxAreaBetweenTwoVerticalLinesBruteForce(input);

        // Then
        int expectedResult = Integer.valueOf(expected).intValue();
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,8,6,2,5,4,8,3,7|49"
            , "3,9,3,4,7,2,12,6|45"
            , "3,3|3"
            , "3,3,4|6"
            , "3,4,3|6"
            , "4,3,4|8"
            , "4,0,4|8"
            , "|0"
            , "0,0,0|0"
            , "null|0"}, delimiter = '|')
    void maxAreaBetweenTwoVerticalLinesWithPointers(String inputDataStrings, String expected) {
        ArrayProblems subject = new ArrayProblems();

        // Given
        int[] input = TestUtil.getIntArray(inputDataStrings);

        // When
        int result = subject.maxAreaBetweenTwoVerticalLinesBruteForce(input);

        // Then
        int expectedResult = Integer.valueOf(expected).intValue();
        assertEquals(expectedResult, result);
    }
}