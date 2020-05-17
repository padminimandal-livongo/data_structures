package cs.fundamental.datastructures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapArrayTest {

    @Test
    @DisplayName("Peek and empty heap")
    void peek() {
        MinHeapArray minHeapArray = new MinHeapArray();
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            minHeapArray.peek();
        });

        assertEquals("Heap is empty!", exception.getMessage());
    }

    @Test
    @DisplayName("Push 1 element to heap")
    void push() {
        MinHeapArray minHeapArray = new MinHeapArray();

        assertDoesNotThrow(() -> {
            minHeapArray.push(new Random().nextInt());
        }, "Push complete without exception");
    }

    @Test
    @DisplayName("Push random 20 elements to heap")
    void pushRandom() {
        MinHeapArray minHeapArray = new MinHeapArray();

        assertDoesNotThrow(() -> {
            new Random().ints(30).forEach(item -> minHeapArray.push(item));
        }, "Push complete without exception");

        assertEquals(40, minHeapArray.size());
    }

    @Test
    @DisplayName("Valid Peek")
    void peekPositive() {
        MinHeapArray minHeapArray = new MinHeapArray();

        for (int i = 10; i > 0; i--) {
            minHeapArray.push(i);
        }

        int result = minHeapArray.peek();

        assertEquals(1, result);
    }

    @Test
    void poll() {
        MinHeapArray minHeapArray = new MinHeapArray();

        // []
        for (int i = 10; i > 0; i--) {
            minHeapArray.push(i);
        }

        assertArrayEquals(new int[]{1, 2, 5, 4, 3, 9, 6, 10, 7, 8}, minHeapArray.getData());
        //int result = minHeapArray.peek()
    }
}