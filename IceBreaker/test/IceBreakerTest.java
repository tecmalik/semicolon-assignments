import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class IceBreakerTest {
    @Test
    public void GetTheMultipleBetweenAGivenRange() {

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        assertEquals(IceBreaker.multiplesOfNumber(1, 10, 2), expected);

    }
    @Test
    public void GetTheMultipleBetweenMixedRange() {

        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(-4);
        expected.add(-2);
        expected.add(0);
        assertEquals(IceBreaker.multiplesOfNumber(1, -5, 2), expected);

    }
    @Test
    public void TestForRangeBetweenNegativeNumbers(){
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(-6);
        expected.add(-4);
        assertEquals(IceBreaker.multiplesOfNumber(-4, -7, -2), expected);
    }
    @Test
    public void TestForRangeBetweenDecimalValues(){
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(-6);
        expected.add(-4);
        expected.add(-2);
     //   assertThrows(IllegalArgumentException.class , ()-> IceBreaker.multiplesOfNumber(-6.45, -4.5, -2.4));
    }
}


