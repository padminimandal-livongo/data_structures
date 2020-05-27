package cs.fundamental.problems.leetcode.arraysandstrings;

/**
 * A] https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2963/
 * 1. Max Area between 2 vertical lines - maxAreaBetweenTwoVerticalLinesBruteForce()
 * 2. Max Area between 2 vertical lines - maxAreaBetweenTwoVerticalLinesWithPointers()
 *
 * B] https://leetcode.com/problems/trapping-rain-water/
 * 1. Max rain water trap = trapMaxRainWaterBruteForce()
 * 2. Max rain water trap = trapMaxRainWaterOptPointerMethod()
 */
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

    /**
     * https://leetcode.com/problems/trapping-rain-water/
     * Trapping Rain Water
     * Given n non-negative integers representing an elevation map where the width of each bar is 1,
     * compute how much water it is able to trap after raining.
     * @param height - Elevation of the ground
     * @return maximum rain water
     */
    public int trapMaxRainWaterBruteForce(int[] height) {
        // Null check
        if(height == null || height.length == 0) {
            return 0;
        }

        int waterVolume = 0;

        int leftMax = 0;
        int rightMax = 0;

        // Populate max left to right height
        int[] left = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            leftMax = Math.max(leftMax, height[i]);
            left[i] = leftMax;
        }

        // Populate max right to left height
        int[] right = new int[height.length];
        for (int i = height.length - 1; i >= 1; i--) {
            rightMax = Math.max(rightMax, height[i]);
            right[i] = rightMax;
        }

        // Calculate min(left, right) - height of index
        for (int i = 1; i < height.length - 1; i++) {
            int minHeight = Math.min(left[i], right[i]) - height[i];
            waterVolume = waterVolume + minHeight;
        }

        return waterVolume;
    }

    /**
     * https://leetcode.com/problems/trapping-rain-water/
     * Trapping Rain Water
     * Given n non-negative integers representing an elevation map where the width of each bar is 1,
     * compute how much water it is able to trap after raining.
     * @param height - Elevation of the ground
     * @return maximum rain water
     */
    public int trapMaxRainWaterOptPointerMethod(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }

        int volume = 0;

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        while(left < right) {

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax) {
                volume = volume + Math.max(0, (leftMax - height[left++]));
            } else {
                volume = volume + Math.max(0, (rightMax - height[right--]));
            }
        }
        return volume;
    }
}
