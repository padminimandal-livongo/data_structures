package cs.fundamental.algorithms.search;

/**
 * Binary Search is performed on Sorted array of data/ elements
 * Split the array into half at median or pivot
 * Time Complexity - O(log N)
 * Space Complexity - O(N)
 */
public class BinarySearch {

    public boolean searchIteratively(int element, int[] elements) {
        // If array is empty return false
        if (elements == null || elements.length == 0) {
            return false;
        }

        int start = 0;
        int end = elements.length - 1;

        while (start <= end) {
            int median = (int) Math.ceil((start + end) / 2);
            if (element > elements[median]) {
                start = median + 1;
            } else if (element < elements[median]) {
                end = median - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean searchRecursively(int[] elements, int element) {

        // If array is empty return false
        if (elements == null || elements.length == 0) {
            return false;
        }

        return search(elements, element, 0, elements.length - 1);
    }

    private boolean search(int[] elements, int element, int start, int end) {
        if (start == end && elements[start] != element) {
            return false;
        }

        int median = (int) Math.ceil((start + end) / 2);

        if (elements[median] == element) {
            return true;
        } else if (element > elements[median]) {
            start = median + 1;
        } else {
            end = median - 1;
        }

        return search(elements, element, start, end);
    }
}
