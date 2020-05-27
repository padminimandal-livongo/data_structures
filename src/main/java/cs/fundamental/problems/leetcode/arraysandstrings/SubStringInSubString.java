package cs.fundamental.problems.leetcode.arraysandstrings;


public class SubStringInSubString {


    /**
     * Complexity Analysis
     * <p>
     * Time complexity: O((N−L)L), where
     * N is a length of haystack and
     * L is a length of needle.
     * Compute a substring of length L in a loop, which is executed (N - L) times.
     * <p>
     * Space complexity: O(1).
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || haystack == null) {
            return 0;
        }

        if (needle.trim().length() == 0 || haystack.trim().length() == 0) {
            return 0;
        }

        int needleLen = needle.length();
        int hayStackLen = haystack.length();

        if (needleLen > hayStackLen) {
            return -1;
        }

        for (int i = 0; i < (hayStackLen - needleLen + 1); i++) {
            if (haystack.substring(i, (i + needleLen)).equals(needle)) {
                return i;
            }
        }

        return -1;

    }


}
