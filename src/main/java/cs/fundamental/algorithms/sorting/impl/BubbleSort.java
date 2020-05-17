package cs.fundamental.algorithms.sorting.impl;

public class BubbleSort extends BaseBruteForceSorting {

    public BubbleSort(int[] elements) {
        this.elements = elements;
    }

    /**
     * 1. Compare 2 elements together
     * 2. Swap elements
     * 3. Max length to compare should be length -1 as there is a swap
     * 4. After each iteration the highest is on the extreme right
     */
    public int[] sort() {
        // We swap hence length - 2 so that we dont hit OutOfBound Exception
        int size = elements.length - 2;
        for (int i = 0; i < elements.length - 2; i++) {
            for (int j = 0; j <= size; j++) {
                if (elements[j] > elements[j + 1]) {
                    swap(j, j + 1);
                }
            }
            // After each iteration extreme end will have the largest value
            size--;
        }
        return elements;
    }

    public void swap(int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }
}
