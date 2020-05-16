package cs.fundamental.problems.leetcode.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * Test Cases:
 * nums = [] and target = 5,  return [0, 0]
 * nums = [1] and target = 1,  return [0, 0]
 * nums = [2, 7, 11, 15] and target = 9,  return [0, 1]
 * nums = [1, 0] and target = 1,  return [0, 1]
 * nums = [2, 3, 5, 6] and target = 11,  return [2, 3]
 * nums = [2, 3, 5, 6] and target = 6,  return [0, 0]
 */
public class TwoSum {

    public int[] bruteForceMethod(int[] nums, int target) {

        if(nums == null || nums.length <= 1) {
            return new int[2];
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[2];
    }

    public int[] twoSumWithMapStorage(int[] nums, int target) {
        if(nums == null || nums.length <= 1) {
            return new int[2];
        }

        Map<Integer, Integer> data = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            data.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int subtractValue = target - nums[i];
            // If the subtract value exists and is not self then return
            if(data.containsKey(subtractValue) && data.get(subtractValue) != i) {
                return new int[] {i, data.get(subtractValue)};
            }
        }

        return new int[2];
    }

}
