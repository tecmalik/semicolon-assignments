import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumbersTest {
    @Test
    public void GettingMissingNumbersTest() {
        int[] input = {0,1,2,5};
        MissingNumbers missingnumbers = new MissingNumbers();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        assertEquals(missingnumbers.getMissingNumbers(input),expected);
    }
    @Test
    public void GettingMissingNumbersSecondTest() {
        int[] input = {77,78,80};
        MissingNumbers missingnumbers = new MissingNumbers();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(79);
        assertEquals(missingnumbers.getMissingNumbers(input),expected);
    }
    @Test
    public void GettingMissingNumbersThirdTest() {
        int[] input = {77,78,79,80};
        MissingNumbers missingnumbers = new MissingNumbers();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(missingnumbers.getMissingNumbers(input),expected);
    }



}
