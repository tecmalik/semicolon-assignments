package sevensegmentdisplay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {
    SevenSegmentDisplay sevenSegmentDisplay;
    @BeforeEach
    public void startWith(){
        sevenSegmentDisplay = new SevenSegmentDisplay();
    }
    @Test
    public void checkingThatAll_ABCDEFGH_DisplaySegmentAreOffTest() {
        assertTrue(sevenSegmentDisplay.isOff());
    }
    @Test
    public void CheckThatMySegment_A_canBeTurnedOnWithTheLastDigitTest() {
        assertTrue(sevenSegmentDisplay.isOff());
        sevenSegmentDisplay.DisplayOutPut("10000001");
        assertFalse(sevenSegmentDisplay.isOff());

    }

}
