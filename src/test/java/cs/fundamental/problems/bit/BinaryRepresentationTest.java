package cs.fundamental.problems.bit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryRepresentationTest {

    @ParameterizedTest
    @CsvSource(value = {"7|111"
            , "131|10000011"
            , "1041|0000010000010001"
            , "15|1111"
            , "32|100000"
            , "4|100"
            , "3|11"}, delimiter = '|')
    void getBinaryRepresentation(int n, String expected) {
        BinaryRepresentation subject = new BinaryRepresentation();
        String result = subject.getBinaryRepresentation(n);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"1041|5"
            , "32|0"
            , "9|2"
            , "529|4"
            , "20|1"
            , "15|0"
            , "1610612737|28"
            , "561892|3"
            , "805306373|25"}, delimiter = '|')
    void getBinaryGapCount(int n, int expected) {

        BinaryRepresentation subject = new BinaryRepresentation();
        int result = subject.getBinaryGapCount(subject.getBinaryRepresentation(n));
        assertEquals(expected, result, subject.getBinaryRepresentation(n));
    }
}