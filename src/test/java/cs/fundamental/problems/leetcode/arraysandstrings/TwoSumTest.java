package cs.fundamental.problems.leetcode.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Cases:
 * 1. nums = [] and target = 5,  return null
 * 2. nums = [1] and target = 1,  return null
 * 3. nums = [2, 7, 11, 15] and target = 9,  return [0, 1]
 * 4. nums = [1, 0] and target = 1,  return [0, 1]
 * 5. nums = [2, 3, 5, 6] and target = 11,  return [2, 3]
 * 6. nums = [2, 3, 5, 6] and target = 6,  return null
 * 7. nums = [3, 3] and target = 6, return [0,1]
 */
class TwoSumTest {

    @Test
    void bruteForceMethod1() {
        int[] nums = {};
        int target = 5;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        assertArrayEquals(new int[2], result);
    }

    @Test
    void bruteForceMethod2() {
        int[] nums = {1};
        int target = 1;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        assertArrayEquals(new int[2], result);
    }

    @Test
    void bruteForceMethod3() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        int[] expected = {0,1};
        assertArrayEquals(expected, result);
    }

    @Test
    void bruteForceMethod4() {
        int[] nums = {1, 0};
        int target = 1;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        int[] expected = {0,1};
        assertArrayEquals(expected, result);
    }

    @Test
    void bruteForceMethod5() {
        int[] nums = {2, 3, 5, 6};
        int target = 11;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        int[] expected = {2, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    void bruteForceMethod6() {
        int[] nums = {2, 3, 5, 6};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        assertArrayEquals(new int[2], result);
    }

    @Test
    void bruteForceMethod7() {
        int[] nums = {3, 3};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.bruteForce(nums, target);

        int[] expected = {0, 1};

        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumWithMapStorage1() {
        int[] nums = {};
        int target = 5;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        assertArrayEquals(new int[2], result);
    }

    @Test
    void twoSumWithMapStorage2() {
        int[] nums = {1};
        int target = 1;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        assertArrayEquals(new int[2], result);
    }

    @Test
    void twoSumWithMapStorage3() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        int[] expected = {0,1};
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumWithMapStorage4() {
        int[] nums = {1, 0};
        int target = 1;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        int[] expected = {0,1};
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumWithMapStorage5() {
        int[] nums = {2, 3, 5, 6};
        int target = 11;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        int[] expected = {2, 3};
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumWithMapStorage6() {
        int[] nums = {2, 3, 5, 6};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        assertArrayEquals(new int[2], result);
    }

    @Test
    void twoSumWithMapStorage7() {
        int[] nums = {3, 3};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumWithMapStorage(nums, target);

        int[] expected = {0, 1};

        assertArrayEquals(expected, result);
    }
}