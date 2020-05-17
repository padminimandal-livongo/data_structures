package cs.fundamental.algorithms.sorting.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void sort() {
        int[] testData = {5, 2, 3, 4, 6};
        int[] expected = {2, 3, 4, 5, 6};
        BubbleSort bubbleSort = new BubbleSort(testData);
        int[] result = bubbleSort.sort();
        assertArrayEquals(expected, result);
    }


    @Test
    void sort2() {
        int[] testData = {0};
        int[] expected = {0};
        BubbleSort bubbleSort = new BubbleSort(testData);
        int[] result = bubbleSort.sort();
        bubbleSort.display();
        assertArrayEquals(expected, result);
    }
}