package cs.fundamental.util;

public class TestUtil {

    public static int[] getIntArray(String inputInStrings) {
        if(inputInStrings == null){
            return null;
        }

        String[] temp =  inputInStrings.split(",");

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
        for(int i = 0; i < length; i++) {
            input[i] = Integer.valueOf(temp[i]).intValue();
        }

        return input;
    }
}
