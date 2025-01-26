import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAutomaticBike {
    AutomaticBike automaticBike;
    @BeforeEach
    public void test_MyBike(){
        automaticBike = new AutomaticBike();
    }
    @Test
    public void test_ThatMyBikeIsOff(){
        assertTrue(automaticBike.powerOff());
    }
    @Test
    public void test_ThatMyBikeCanOn(){
        assertTrue(automaticBike.powerOn());
    }
    @Test
    public void test_ThatMyBikeCan_is_not_in_motion(){
        automaticBike.getGear();
        assertEquals(0,automaticBike.getGear());
        automaticBike.getAcceleration();
        assertEquals(0,automaticBike.getGear());
        automaticBike.getSpeed();
        assertEquals(0,automaticBike.getSpeed());
    }
    @Test
    public void test_thatMyBikeCan_drive(){
        automaticBike.IncreaseGear();
        automaticBike.getAcceleration();
    }



}
