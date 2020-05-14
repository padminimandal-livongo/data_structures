package cs.fundamental.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = {25, 30, 60, 65, 70, 80};
        int searchValue = 30;
        boolean result = binarySearch.searchIteratively(searchValue, input);

        assertTrue(result);
    }

    @Test
    void searchNegative() {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = {25, 30, 60, 65, 70, 80};
        int searchValue = 100;
        boolean result = binarySearch.searchIteratively(searchValue, input);

        assertFalse(result);
    }

    @Test
    void searchIteratively() {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = {25, 30, 60, 65, 70, 80};
        int searchValue = 30;
        boolean result = binarySearch.searchRecursively(input, searchValue);

        assertTrue(result);

    }

    @Test
    void searchIterativelyNegative() {
        BinarySearch binarySearch = new BinarySearch();
        int[] input = {25, 30, 60, 65, 70, 80};
        int searchValue = 100;
        boolean result = binarySearch.searchRecursively(input, searchValue);

        assertFalse(result);
    }
}