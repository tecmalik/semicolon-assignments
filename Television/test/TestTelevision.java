import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTelevision {
    Television television;
    @BeforeEach
    public void setup() {
        television = new Television();
    }

    @Test
    public void test_thatTelevisionIsOff(){
        assertFalse(television.isOn());
    }
    @Test
    public void test_thatTelevisionCAnBeTurnedNo(){
        assertFalse(television.isOn());
        television.turnOn();
        assertTrue(television.isOn());
    }
    @Test
    public void test_thatTelevisionCAnBeTurnedOnAndOff(){
        assertFalse(television.isOn());
        television.turnOn();
        assertTrue(television.isOn());
        television.turnOff();
        assertFalse(television.isOn());
    }
    @Test
    public void test_thatTelevisionCAnIncreaseVolume(){
        television.turnOn();
        assertTrue(television.isOn());
        assertEquals(50,television.getVolume());
        television.increaseVolume();
        assertEquals(60 , television.getVolume());
    }
    @Test
    public void test_thatTelevisionVolumeCantIncreaseVolumeWhenOff(){
        assertFalse(television.isOn());
        assertThrows(IllegalStateException.class, ()->television.increaseVolume());
    }
    @Test
    public void test_thatTelevisionWillThrowAnErrorForVolumeIncreaseAbove100(){
        television.turnOn();
        for(int count = 0; count < 5; count++){
        television.increaseVolume();
        }
        assertEquals(100, television.getVolume());
        assertThrows(IllegalStateException.class, ()->television.increaseVolume());
    }
    @Test
    public void test_thatTelevisionCanDecreaseVolumeWhenOn(){
        television.turnOn();
        assertEquals(50,television.getVolume());
        television.decreaseVolume();
        assertEquals(40 , television.getVolume());
    }
    @Test
    public void test_thatTelevisionCanNotDecreaseVolumeWhenOff(){
        assertFalse(television.isOn());
        assertThrows(IllegalStateException.class, ()->television.decreaseVolume());

    }
    @Test
    public void test_thatTelevisionCanNotDecreaseVolumeWhenBelowZero(){
        assertFalse(television.isOn());
        assertEquals(50,television.getVolume());
        for(int count = 0; count < 5; count++ ){
            television.decreaseVolume();
        }
        assertEquals(0 , television.getVolume());
        assertThrows(IllegalStateException.class ,()->television.decreaseVolume());
    }
}
