package cs.fundamental.problems.bit;

import java.util.Iterator;
import java.util.Stack;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
 * both ends in the binary representation of N.
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of length 1.
 * The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000
 * and has no binary gaps.
 */
public class BinaryRepresentation {

    /**
     * This method returns Binary representation of a number
     *
     * @param n - Number to convert to Binary
     * @return Binary String representation of the number
     */
    public String getBinaryRepresentation(int n) {

        Stack<Integer> binary = new Stack<>();
        binary.push(n % 2);

        getBinaryOfNumber(n, binary);

        StringBuffer str = new StringBuffer();
        Iterator<Integer> itr = binary.iterator();

        while (itr.hasNext()) {
            str.append(itr.next() % 2);
        }

        return str.reverse().toString();
    }

    /**
     * Recursive method to get the binary stack
     *
     * @param n
     * @param binary
     */
    private void getBinaryOfNumber(int n, Stack<Integer> binary) {

        if (n == 1) {
            binary.push(1);
            return;
        }

        // If N/2 > 1 then push the modulus of the modulus of N/2
        if (n / 2 > 1) {
            binary.push(n / 2 % 2);
        }

        // Recurse until we get n = 1
        getBinaryOfNumber(n / 2, binary);

    }

    /**
     * This method counts the number of 0 between 1's and returns the max.
     * <p>
     * // 1 0 0 0 0 0 1 0 0 0 1
     * // 0 1 2 3 4 5 6 7 8 9 10
     *
     * @param data
     * @return
     */
    public int getBinaryGapCount(String data) {
        int maxCount = 0;
        int prevOneIndex = -1; // 0
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '1') {
                if (prevOneIndex != -1) {
                    maxCount = Math.max(maxCount, i - prevOneIndex - 1);
                    prevOneIndex = i;
                } else {
                    prevOneIndex = i;
                }
            }
        }
        return maxCount;
    }
}
