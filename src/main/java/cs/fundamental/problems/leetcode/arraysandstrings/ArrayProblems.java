package cs.fundamental.problems.leetcode.arraysandstrings;

public class ArrayProblems {

    /**
     * Area between 2 vertical lines
     * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2963/
     * @param data - Height of the vertical lines
     * @return max area between 2 vertical lines
     */
    public int maxAreaBetweenTwoVerticalLinesBruteForce(int[] data) {

        if (data == null || data.length == 0) {
            return 0;
        }

        int maxArea = 0;

        for(int i = 0; i < data.length; i++) {
            for(int j = i + 1; j < data.length; j++) {
                int area = Math.min(data[i] , data[j]) * (j - i);
                maxArea = Math.max(maxArea,  area);
            }
        }
        return maxArea;
    }

    /**
     * Optimized solution for Area between 2 vertical lines
     * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2963/
     * @param data - Height of the vertical lines
     * @return max area between 2 vertical lines
     */
    public int maxAreaBetweenTwoVerticalLinesWithPointers(int[] data) {
        int maxArea = 0;
        int left = 0;
        int right = data.length - 1;

        while(left < right) {
            int area = Math.min(data[left], data[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(data[left] > data[right]) {
                right --;
            } else {
                left ++;
            }
        }

        return maxArea;
    }
}
