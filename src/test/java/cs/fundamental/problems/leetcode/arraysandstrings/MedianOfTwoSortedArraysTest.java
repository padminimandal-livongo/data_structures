package cs.fundamental.problems.leetcode.arraysandstrings;

import cs.fundamental.util.TestUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    @ParameterizedTest
    @CsvSource(value = {"1,2|4,5|3"
            , "3,5,9,10,11,16|4,6,8,15|8.5"
            , "3,7,9,15,18,21,25|4,6,8,10,11,18|10"
            , "1,2,3,4|5,6,7,8|4.5"}, delimiter = '|')
    void findMedianBruteForce(String firstArray, String secondArray, double expected) {

        int[] first = TestUtil.getIntArray(firstArray);
        int[] second = TestUtil.getIntArray(secondArray);
        MedianOfTwoSortedArrays subject = new MedianOfTwoSortedArrays();

        double result = subject.findMedianBruteForce(first, second);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2|4,5|3"
            , "3,5,9,10,11,16|4,6,8,15|8.5"
            , "3,7,9,15,18,21,25|4,6,8,10,11,18|10"
            , "1,2,3,4|5,6,7,8|4.5"}, delimiter = '|')
    void findMedian(String firstArray, String secondArray, double expected) {

        int[] first = TestUtil.getIntArray(firstArray);
        int[] second = TestUtil.getIntArray(secondArray);
        MedianOfTwoSortedArrays subject = new MedianOfTwoSortedArrays();

        double result = subject.findMedian(first, second);

        assertEquals(expected, result);
    }
}