package sevensegmentdisplay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {
    Board sevenSegmentDisplay;
    @BeforeEach
    public void startWith(){
        sevenSegmentDisplay = new Board();
    }
    @Test
    public void AllSegmentDisplayAreOffByDefaultTest(){
       assertTrue(sevenSegmentDisplay.isOff());
    }
    @Test
    public void whenFirstDigitIsOneSegment_A_IsTurnedOnTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("10000001");
       assertFalse(sevenSegmentDisplay.isOff());
        assertEquals(new SegmentA(0,3), sevenSegmentDisplay.getSegmentA());
    }
    @Test
    public void SecondDigitCharacterSwitchesOnSegment_B_whenItDigitOneTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("01000001");
       assertFalse(sevenSegmentDisplay.isOff());
        assertEquals(new SegmentB(2,3), sevenSegmentDisplay.getSegmentB());
    }
    @Test
    public void thirdDigitCharacterSwitchesOnSegment_C_whenItDigitOneTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("0O100001");
       assertFalse(sevenSegmentDisplay.isOff());
        assertEquals(new SegmentC(4,3), sevenSegmentDisplay.getSegmentC());
    }
    @Test
    public void ForthDigitCharacterSwitchesOnSegment_D_whenItDigitOneTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("0O010001");
       assertFalse(sevenSegmentDisplay.isOff());
        assertEquals(new SegmentD(4,0), sevenSegmentDisplay.getSegmentD());
    }
    @Test
    public void FifthDigitCharacterSwitchesOnSegment_E_whenItDigitOneTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("0O001001");
       assertFalse(sevenSegmentDisplay.isOff());
        assertEquals(new SegmentE(2,0), sevenSegmentDisplay.getSegmentE());
    }@Test
    public void sixthDigitCharacterSwitchesOnSegment_F_whenItDigitOneTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("0O000101");
       assertFalse(sevenSegmentDisplay.isOff());
       assertEquals(new SegmentF(0,0), sevenSegmentDisplay.getSegmentF());
    }
    @Test
    public void SeventhDigitCharacterSwitchesOnSegment_G_whenItDigitOneTest(){
       assertTrue(sevenSegmentDisplay.isOff());
       sevenSegmentDisplay.display("0O000011");
       assertFalse(sevenSegmentDisplay.isOff());
       assertEquals(new SegmentG(2,3), sevenSegmentDisplay.getSegmentG());
    }
    @Test
    public void StringInputNotEqualToEightCharactersWontDisplay_Test(){
        assertThrows(IllegalArgumentException.class, ()-> sevenSegmentDisplay.display("0O0000100"));
        assertThrows(IllegalArgumentException.class, ()-> sevenSegmentDisplay.display("0O0000"));
    }
    @Test
    public void boardCanDisplayFigureEight(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {'#',' ',' ','#'},
                {'#','#','#','#'},
                {'#',' ',' ','#'},
                {'#','#','#','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("11111111");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureNine(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {'#',' ',' ','#'},
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {'#','#','#','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("11110111");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureSeven(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("11100001");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureSix(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {'#',' ',' ',' '},
                {'#','#','#','#'},
                {'#',' ',' ','#'},
                {'#','#','#','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("10111111");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureFive(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {'#',' ',' ',' '},
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {'#','#','#','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("10110111");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureFour(){
        char[][]  expectedBoard = {
                {'#',' ',' ','#'},
                {'#',' ',' ','#'},
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("01100111");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureThree(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {'#','#','#','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("11110011");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureTwo(){
        char[][]  expectedBoard = {
                {'#','#','#','#'},
                {' ',' ',' ','#'},
                {'#','#','#','#'},
                {'#',' ',' ',' '},
                {'#','#','#','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("11011011");
        assertArrayEquals( expectedBoard ,actualBoard);

    };
    @Test
    public void boardCanDisplayFigureOne(){
        char[][]  expectedBoard = {
                {' ',' ',' ','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'},
                {' ',' ',' ','#'}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("01100001");
        assertArrayEquals(expectedBoard ,actualBoard);

    };
    @Test
    public void BoardShouldNotDisplayIfStringInputForTheLastDigitIsNotOne_Test(){
        char[][]  expectedBoard = {
                {' ',' ',' ',' '},
                {' ',' ',' ',' '},
                {' ',' ',' ',' '},
                {' ',' ',' ',' '},
                {' ',' ',' ',' '}

        };
        char[][] actualBoard = sevenSegmentDisplay.display("11111110");
        assertArrayEquals(expectedBoard ,actualBoard);

    };

    @Test
    public void StringInputForAlphaNumericInput_Test(){
        assertThrows(IllegalArgumentException.class, ()-> sevenSegmentDisplay.display("0Osew001"));
        assertThrows(IllegalArgumentException.class, ()-> sevenSegmentDisplay.display("0Osew001"));
    }



}
