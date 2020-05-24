package cs.fundamental.problems.leetcode.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

public class SubStringProblems {

    /**
     * Possible Iterations is O(N)
     0	: p     - count 1
     1	: pw    - count 2
     2	: pww   - Repeat
     3	: pwwk   - Repeat
     4	: pwwke   - Repeat
     5	: pwwkew   - Repeat
     6	: w    - count 1
     7	: ww   - Repeat
     8	: wwk   - Repeat
     9	: wwke   - Repeat
     10	 : wwkew   - Repeat
     11	 : w    - count 1
     12	 : wk    - count 2
     13	 : wke    - count 3
     14	 : wkew   - Repeat
     15	 : k    - count 1
     16	 : ke    - count 2
     17	 : kew    - count 3
     18	 : e    - count 1
     19	 : ew    - count 2
     20	 : w    - count 1
     * @param s
     * @return
     */
    public int longestSubstringWithoutRepeatingCharactersBruteForce(String s) {

        if(s == null || s.length() == 0) {
            return 0;
        }
        int length = s.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            // Its a Substring hence < or = length
            for (int j = i + 1; j <= length; j++) {
                //System.out.println(s.substring(i, j) + " : " + isDistinctString(s, i, j));
                if(isDistinctString(s, i, j)) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }

    /**
     * Check if the string has distinct/ unique characters
     * @param s - String to check
     * @param start - Starting index for substring
     * @param end - Ending index for substring
     * @return boolean to indicate if the String has unique characters or not
     */
    private boolean isDistinctString(String s, int start, int end) {
        Set<Character> unique = new HashSet<>();
        for(int i = start; i < end; i++) {
            if(!unique.add(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Solution 2: Optimized to break from the loop if duplicates found
     * @param s - String to operate and find non repeating unique substring
     * @return count of Max non repeating substring
     */
    public int longestSubstringWithoutRepeatingCharactersOptimize1(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        int length = s.length();
        int max = 0;
        for(int  i = 0; i < length; i++) {
            // Its a Substring hence < or = length
            for(int j = i + 1; j <= length; j++) {
                if(isDistinctString(s, i, j)) {
                    max = Math.max(max, j - i);
                } else {
                    break;
                }
            }
        }
        return max;
    }
}
