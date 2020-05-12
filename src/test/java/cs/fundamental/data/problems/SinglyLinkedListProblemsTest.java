package cs.fundamental.data.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListProblemsTest {

    @Test
    void findLoopExits() {
        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        Integer[] data = new Integer[]{1, 2, 5, 8, 10, 20, 30, 40, 8};
        boolean result = singlyLinkedListProblems.findLoopExits(data);
        Assertions.assertTrue(result);
    }

    @Test
    void findLoopExitsEmptyList() {
        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        Integer[] data = new Integer[]{};
        boolean result = singlyLinkedListProblems.findLoopExits(data);
        Assertions.assertFalse(result);
    }

    @Test
    void findLoopExitsPositive() {
        SinglyLinkedListProblems<Integer> singlyLinkedListProblems = new SinglyLinkedListProblems<Integer>();
        Integer[] data = new Integer[]{1, 2, 5, 8, 10, 20, 30, 40};
        boolean result = singlyLinkedListProblems.findLoopExits(data);
        Assertions.assertFalse(result);
    }
}