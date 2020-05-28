package cs.fundamental.util;

import cs.fundamental.datastructures.SinglyLinkedListDemo;
import cs.fundamental.node.SinglyLinkedListNode;

public class TestUtil {

    public static int[] getIntArray(String inputInStrings) {
        if (inputInStrings == null) {
            return null;
        }

        String[] temp = inputInStrings.split(",");

        if(temp.length == 0) {
            return new int[]{};
        }

        if(temp.length == 1 && temp[0].equals("null")) {
            return null;
        }
        // Get length
        int length = temp.length;

        // New int array
        int[] input = new int[length];

        // Iterate temp to construct new int array
        for (int i = 0; i < length; i++) {
            input[i] = Integer.valueOf(temp[i]).intValue();
        }

        return input;
    }

    public static String[] getStringArray(String inputInStrings) {
        if (inputInStrings == null) {
            return null;
        }

        String[] temp = inputInStrings.split(",");

        if (temp.length == 0) {
            return new String[]{};
        }

        if (temp.length == 1 && temp[0].equals("null")) {
            return null;
        }
        // Get length
        int length = temp.length;

        // New int array
        String[] input = new String[length];

        // Iterate temp to construct new int array
        for (int i = 0; i < length; i++) {
            input[i] = temp[i];
        }

        return input;
    }

    /**
     * Get List data in String array. Pares the values to List and return Root node
     *
     * @param dataInText
     * @return
     */
    public static SinglyLinkedListNode<Integer> getList(String dataInText) {
        if (dataInText == null || dataInText.trim().length() == 0) {
            return null;
        }
        SinglyLinkedListDemo<Integer> list = new SinglyLinkedListDemo<>();
        String[] data = dataInText.split(",");
        for (int i = 0; i < data.length; i++) {
            list.addNode(Integer.valueOf(data[i]));
        }
        return list.getRoot();
    }
}
