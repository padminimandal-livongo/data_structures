package cs.fundamental.problems.leetcode.arraysandstrings;

import java.util.*;

public class SubStringProblems {

    /**
     * Possible Iterations is O(N)
     * @param s - String to perform operation
     * @return count of non repeating substring
     */
    public int lengthOfLongestSubstringBruteForce(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        int length = s.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            // Its a Substring hence < or = length
            for (int j = i + 1; j <= length; j++) {
                //System.out.println(s.substring(i, j) + " : " + isDistinctString(s, i, j));
                if (isDistinctString(s, i, j)) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }

    /**
     * Check if the string has distinct/ unique characters
     *
     * @param s     - String to check
     * @param start - Starting index for substring
     * @param end   - Ending index for substring
     * @return boolean to indicate if the String has unique characters or not
     */
    private boolean isDistinctString(String s, int start, int end) {
        Set<Character> unique = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (!unique.add(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Solution 2: Optimized to break from the loop if duplicates found
     *
     * @param s - String to operate and find non repeating unique substring
     * @return count of Max non repeating substring
     */
    public int lengthOfLongestSubstringNaive(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int length = s.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            // Its a Substring hence < or = length
            for (int j = i + 1; j <= length; j++) {
                if (isDistinctString(s, i, j)) {
                    max = Math.max(max, j - i);
                } else {
                    break;
                }
            }
        }
        return max;
    }

    /**
     * Optimized solution for finding longest non repeating substring
     *
     * @param s - String to check
     * @return length of the string that does not repeat in the string
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int max = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        int leftPointer = 0;
        for (int rightPointer = 0; rightPointer < n; rightPointer++) {
            if (map.containsKey(s.charAt(rightPointer))) {
                leftPointer = Math.max(map.get(s.charAt(rightPointer)), leftPointer);
            }
            max = Math.max(max, rightPointer - leftPointer + 1);
            map.put(s.charAt(rightPointer), rightPointer + 1);
        }
        return max;
    }

    public int convertStringToInteger(String data) {
        if(data == null || data.trim().length() == 0) {
            return 0;
        }

        char[] nums = data.trim().toCharArray();

        int i = 0;
        boolean isSigned = false;
        if(nums[0] == '+' || nums[0] == '-') {
            isSigned = true;
            i = 1;
        }

        int start = i;
        int end = 0;
        for(i = i; i < nums.length; i++) {

            switch(nums[i]) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    end = i;
                    break;
                default: {
                    // If character is not digit return 0
                    if(i == 0 || i == 1) {
                        return 0;
                    } else {
                        break;
                    }
                }
            }
        }

        String result = data.substring(start, end);

        int units = 1;
        int sum = 0;
        for(int j = result.length() - 1; j >= 0; j--) {
            sum = sum + ( (int) result.charAt(j) * units) ;
            units = units * 10;
        }

        return sum;

    }
}
