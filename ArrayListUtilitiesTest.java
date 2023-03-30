import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testwithoutLongWords(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        // some positive numbers
        input = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaaaaa", "aaa", "aaaaaaa"));
        expectedOutput = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaa"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testremoveLongWords(){
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaaaaa", "aaa", "aaaaaaa"));
        ArrayList<String> expectedOutput;

        // some positive numbers
        input = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaaaaa", "aaa", "aaaaaaa"));
        expectedOutput = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaa"));
        ArrayListUtilities.removeLongWords(input);
        assertEquals(expectedOutput, input);
    }

    @Test
    public void testreversed(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        // some positive numbers
        input = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaaaaa", "aaa", "aaaaaaa"));
        expectedOutput = new ArrayList<String>(Arrays.asList("aaaaaaa", "aaa", "aaaaaa", "aaaaa", "a"));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testreverseInPlace(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;

        // some positive numbers
        input = new ArrayList<String>(Arrays.asList("a", "aaaaa", "aaaaaa", "aaa", "aaaaaaa"));
        expectedOutput = new ArrayList<String>(Arrays.asList("aaaaaaa", "aaa", "aaaaaa", "aaaaa", "a"));
        ArrayListUtilities.reverseInPlace(input);
        assertEquals(expectedOutput, input);
    }

    public static void main(String[] args) {
        
    }
}
