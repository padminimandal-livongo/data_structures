package cs.fundamental.problems.leetcode.arraysandstrings;

/**
 * Find median of Two Sorted Arrays
 * https://leetcode.com/explore/interview/card/amazon/79/sorting-and-searching/2991/
 * Important Points:
 * 1. Choose the smalled array
 * 2. Iterate on smaller array for median
 */
public class MedianOfTwoSortedArrays {

    public double findMedianBruteForce(int[] first, int[] second) {

        int firstLen = first.length;
        int secondLen = second.length;

        int[] result = new int[firstLen + secondLen];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < firstLen && j < secondLen) {
            if (first[i] < second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < firstLen) {
            result[k] = first[i];
            k++;
            i++;
        }

        while (j < secondLen) {
            result[k] = second[j];
            k++;
            j++;
        }

        // At this point we have 1 complete array.
        int median = result.length / 2;
        if (result.length % 2 == 0) {
            double medianResult = result[median] + result[median - 1];
            return (medianResult) / 2;
        } else {
            return result[median];
        }
    }


    public double findMedian(int[] first, int[] second) {
        int firstLen = first.length;
        int secLen = second.length;

        if (firstLen > secLen) {
            return findMedian(second, first);
        }

        int left = 0;
        int right = firstLen;

        while (left <= right) {
            int xPartition = (left + right) / 2;
            int yPartition = ((firstLen + secLen + 1) / 2) - xPartition;

            int xLeftMax = (xPartition == 0) ? Integer.MIN_VALUE : first[xPartition - 1];
            int xRightMin = (xPartition == firstLen) ? Integer.MAX_VALUE : first[xPartition];

            int yLeftMax = (yPartition == 0) ? Integer.MIN_VALUE : second[yPartition - 1];
            int yRightMin = (yPartition == secLen) ? Integer.MAX_VALUE : second[yPartition];

            if (xLeftMax <= yRightMin && yLeftMax <= xRightMin) {
                if (((firstLen + secLen) % 2) == 0) {
                    return (double) (Math.max(xLeftMax, yLeftMax) + Math.min(xRightMin, yRightMin)) / 2;
                } else {
                    return Math.max(xLeftMax, yLeftMax);
                }

            }
            if (xLeftMax > yRightMin) {
                right = xPartition - 1;
            } else {
                left = xPartition + 1;
            }
        }

        throw new IllegalStateException("Arrays are not sorted.");
    }
}
