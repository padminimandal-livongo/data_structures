package cs.fundamental.problems.leetcode.arraysandstrings;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * 1. Max rain water trap = trapMaxRainWaterBruteForce()
 * 2. Max rain water trap = trapMaxRainWaterOptPointerMethod()
 */
public class RainWaterTrap {

    /**
     * https://leetcode.com/problems/trapping-rain-water/
     * Trapping Rain Water
     * Given n non-negative integers representing an elevation map where the width of each bar is 1,
     * compute how much water it is able to trap after raining.
     *
     * @param height - Elevation of the ground
     * @return maximum rain water
     */
    public int bruteForce(int[] height) {
        // Null check
        if (height == null || height.length == 0) {
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
     *
     * @param height - Elevation of the ground
     * @return maximum rain water
     */
    public int pointerMethod(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int volume = 0;

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {
                volume = volume + Math.max(0, (leftMax - height[left++]));
            } else {
                volume = volume + Math.max(0, (rightMax - height[right--]));
            }
        }
        return volume;
    }
}
