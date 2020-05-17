package cs.fundamental.datastructures;

import java.util.Arrays;

/**
 * Min Heap using Array implementation
 * <p>
 * Notes:
 * 1. (size) always points to next insert location
 * 2. (size - 1) always points to last inserted record. Keep in mind working with last inserted record is (size - 1)
 * 3. Heap is all about index
 */
public class MinHeapArray {

    private int capacity = 10;
    private int size = 0;

    private int[] elements = new int[capacity];


    public int size() {
        return capacity;
    }

    /**
     * Added for testing and understanding purpose
     *
     * @return
     */
    public int[] getData() {
        return elements;
    }

    public int peek() throws IllegalStateException {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty!");
        }

        return elements[0];
    }

    public int poll() throws IllegalStateException {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty!");
        }

        int temp = elements[0];

        elements[0] = elements[size - 1];
        size--;

        heapifyDown();

        return temp;
    }

    public void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);

            if (hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (elements[index] > elements[smallerChildIndex]) {
                swap(index, smallerChildIndex);
            } else {
                break;
            }

            index = smallerChildIndex;
        }
    }

    public void push(int element) {
        checkCapacity();

        elements[size] = element;
        size++;

        heapifyUp();
    }

    public void heapifyUp() {

        int index = size - 1;

        while (hasParent(index) && getParent(index) > elements[index]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }

    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChild(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int getLeftChild(int index) {
        return elements[getLeftChildIndex(index)];
    }

    private int getRightChild(int index) {
        return elements[getRightChildIndex(index)];
    }

    private int getParent(int index) {
        return elements[getParentIndex(index)];
    }

    private void swap(int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    private void checkCapacity() {
        if (size == capacity) {
            elements = Arrays.copyOf(elements, capacity * 2);
            capacity = capacity * 2;
        }
    }
}
