package cs.fundamental.problems.array;

import java.util.Arrays;

/**
 * 1. Search word exists in a char array
 * 2. Recursive function to do substring search - containsString [https://www.geeksforgeeks.org/recursive-function-to-do-substring-search/]
 */
public class TwoArrayProblems {

    private boolean isEqualArray(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Given a text text[] and a text findText[],
     * write a function “contains(char findText[], char txt[])” that returns true if findText[] is present in txt[],
     * otherwise false.
     *
     * @param text     - Text Array
     * @param findText - findText Array
     * @return boolean
     */
    public boolean containsString(char[] text, char[] findText) {
        if (text == null && findText == null) {
            return true;
        }

        if (text == null || findText == null) {
            return false;
        }

        if (findText.length > text.length) {
            return false;
        }

        int startPos = 0;
        for (int j = 0; j < text.length; j++) {
            // For all space separate check
            if (text[j] == ' ') {
                if (isEqualArray(Arrays.copyOfRange(text, startPos, j), findText)) {
                    return true;
                }
                startPos = j + 1; // We don't want space
            }
            // If we are at the last word in the array there will not be space
            // Edge case to handle last word
            if (j == text.length - 1) {
                return isEqualArray(Arrays.copyOfRange(text, startPos, j + 1), findText);
            }
        }
        return false;
    }
}
