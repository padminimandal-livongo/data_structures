package cs.fundamental.problems.leetcode.arraysandstrings;

import cs.fundamental.util.TestUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RainWaterTrapTest {

    @ParameterizedTest
    @CsvSource(value = {"0,1,0,2,1,0,1,3,2,1,2,1|6"
            , "1,2,2,3,3,1,4,2,0,0|2"
            , "0,1,0,1|1"}, delimiter = '|')
    void bruteForce(String inputDataStrings, String expected) {
        RainWaterTrap subject = new RainWaterTrap();

        // Given
        int[] input = TestUtil.getIntArray(inputDataStrings);

        // When
        int result = subject.bruteForce(input);

        // Then
        int expectedResult = Integer.valueOf(expected).intValue();
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,1,0,2,1,0,1,3,2,1,2,1|6"
            , "1,2,2,3,3,1,4,2,0,0|2"
            , "0,1,0,1|1"}, delimiter = '|')
    void pointerMethod(String inputDataStrings, String expected) {
        RainWaterTrap subject = new RainWaterTrap();

        // Given
        int[] input = TestUtil.getIntArray(inputDataStrings);

        // When
        int result = subject.pointerMethod(input);

        // Then
        int expectedResult = Integer.valueOf(expected).intValue();
        assertEquals(expectedResult, result);
    }
}