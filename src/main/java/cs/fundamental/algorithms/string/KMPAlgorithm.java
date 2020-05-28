package cs.fundamental.algorithms.string;

import lombok.Getter;
import lombok.NonNull;

/**
 * Knuth Morris Pratt Pattern matching Algorithm to find/search pattern in a given substring
 * <p>
 * Followed Author Tushar Roy
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/string/SubstringSearch.java
 * to solve
 * https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2968/
 */
@Getter

public class KMPAlgorithm {

    public int containsPattern(String text, String patternText) {
        if (text == null || patternText == null) {
            return 0;
        }

        if (text.trim().length() == 0 || patternText.trim().length() == 0) {
            return 0;
        }

        if (text.trim().length() < patternText.trim().length()) {
            return 0;
        }

        int[] patternIndex = prepPattern(patternText);
        char[] data = text.toCharArray();
        char[] pattern = patternText.toCharArray();
        int i = 0;
        int j = 0;
        while (i < data.length && j < pattern.length) {
            if (data[i] == pattern[j]) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = patternIndex[j - 1];
                    // No increment of i
                } else {
                    i++;
                }
            }
        }

        if (j == patternIndex.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    /**
     * Based on pattern generate a int array to guide the search.
     * https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm
     *
     * @param pattern - Text to search in another string
     * @return int[] with search index
     */
    public int[] prepPattern(@NonNull String pattern) {

        char[] patternChar = pattern.toCharArray();
        int[] preppedPattern = new int[patternChar.length];

        // Left is starting index from left
        // right is the index which does not reset during the course
        int left = 0;
        for (int right = 1; right < patternChar.length; ) {
            // If chars are same
            if (patternChar[left] == patternChar[right]) {
                preppedPattern[right] = left + 1;
                right++;
                left++;
            } else {
                // If char are not same and left index != 0
                if (left != 0) {
                    left = preppedPattern[left - 1];
                    // No right increment
                } else {
                    preppedPattern[left] = 0;
                    right++;
                }
            }
        }

        return preppedPattern;
    }

}
