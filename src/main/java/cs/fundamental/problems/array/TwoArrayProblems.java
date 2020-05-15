package cs.fundamental.problems.array;

import java.util.Arrays;

/**
 * 1. Recursive function to do substring search - containsString
 */
public class TwoArrayProblems {

    private boolean isEqualArray(char[] a, char[] b) {
        if(a.length != b.length) {
            return false;
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Given a text text[] and a pattern pat[],
     * write a function “contains(char pat[], char txt[])” that returns true if pat[] is present in txt[],
     * otherwise false.
     * @param text - Text Array
     * @param pattern - Pattern Array
     * @return boolean
     */
    public boolean containsString(char[] text, char[] pattern) {
        // If both the arrays are null return they match
        if(text == null && pattern == null) {
            return true;
        }

        // If either of the array is null return false
        if(text == null || pattern == null) {
            return false;
        }

        // If pattern array is greater than text return false
        if(pattern.length > text.length) {
            return false;
        }

        int startPos = 0;
        for(int j = 0; j < text.length; j++) {
            // For all space separate check
            if(text[j] == ' ') {
                if(isEqualArray(Arrays.copyOfRange(text, startPos, j), pattern)) {
                    return true;
                }
                startPos = j + 1; // We don't want space
            }
            // If we are at the last word in the array there will not be space
            // Edge case to handle last word
            if(j == text.length - 1) {
                return isEqualArray(Arrays.copyOfRange(text, startPos, j + 1), pattern);
            }
        }
        return false;
    }
}
