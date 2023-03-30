import java.util.ArrayList;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int max = 0;
        for (Integer integer : items) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> inputList) {
        ArrayList<String> outputList = new ArrayList<String>(inputList.size());
        for (String string : inputList) {
            if (string.length() <= 5) {
                outputList.add(string);
            }
        }
        return outputList;
    }

    public static void removeLongWords(ArrayList<String> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).length() > 5) {
                inputList.remove(i);
                i--;
            }
        }
    }

    public static ArrayList<String> reversed(ArrayList<String> inputList) {
        ArrayList<String> outputList = new ArrayList<String>(inputList.size());
        for (int i = inputList.size() - 1; i >= 0; i--) {
            outputList.add(inputList.get(i));
        }
        return outputList;
    }

    public static  void reverseInPlace(ArrayList<String> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            inputList.add(i, inputList.remove(inputList.size() - 1));
        }
    }
    public static void main(String[] args) {
        
    }
}