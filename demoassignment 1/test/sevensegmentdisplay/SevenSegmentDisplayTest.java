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
    public void CheckThatMySegment_A_canBeTurnedOnWithTheLastDigitTest() {
        assertFalse(sevenSegmentDisplay.display());
        sevenSegmentDisplay.userDisplayInput("10000001");
        assertTrue(sevenSegmentDisplay.display());
    }

}
