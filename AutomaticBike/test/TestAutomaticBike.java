import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import static org.junit.jupiter.api.Assertions.*;

public class TestAutomaticBike {
    AutomaticBike automaticBike;
    @BeforeEach
    public void test_MyBike(){
        automaticBike = new AutomaticBike();
    }
    @Test
    public void test_ThatMyBikeIsOff(){
        assertTrue(automaticBike.powerIsOff());
    }
    @Test
    public void test_ThatMyBikeCanOn(){
        automaticBike.powerOn();
        assertTrue(automaticBike.powerIsOn());
    }
    @Test
    public void test_ThatMyBikeCan_is_not_in_motion(){
        assertEquals(0,automaticBike.getGear());
        assertEquals(0,automaticBike.getAcceleration());
        assertEquals(0,automaticBike.getSpeed());
    }
    @Test
    public void test_thatMyBikeIsOffICantIncreaseGear(){
        automaticBike.powerIsOff();
        automaticBike.increaseGear();
        assertTrue(automaticBike.powerIsOff());
        assertFalse(automaticBike.powerIsOn());
        assertEquals(0,automaticBike.getGear());
    }
    @Test
    public void test_thatMyBikeIsOnAndCanIncreaseToGearOne (){
        automaticBike.powerOn();
        automaticBike.increaseGear();
        automaticBike.accelerate();
        assertEquals(1,automaticBike.getGear());
        assertEquals(1,automaticBike.getSpeed());

    }
    @Test
    public void test_thatWhenMyBikeIsOnGear_1_AccelerationContineToIncermentByOne(){
        automaticBike.powerOn();
        automaticBike.increaseGear();
        automaticBike.accelerate();
        automaticBike.accelerate();
        automaticBike.accelerate();
        assertEquals(1,automaticBike.getGear());
        assertEquals(3,automaticBike.getSpeed());
    }
    @Test
    public void test_thatMyBikeCanBePoweredOnAndPoweredOff(){
        assertTrue(automaticBike.powerIsOff());
        automaticBike.powerOn();
        assertTrue(automaticBike.powerIsOn());
        automaticBike.powerOff();
        assertFalse(automaticBike.powerIsOn());
    }
    @Test
    public void test_thatWhenMyBikeSpeedCanIncreaseAndChangeToTheNextGear(){
        automaticBike.powerOn();
        automaticBike.increaseGear();
        automaticBike.increaseGear();
        assertEquals(2,automaticBike.getGear());
    }
    @Test
    public void test_myBikeCanSwitchToGear2AutomaticallyAsTheTheSpeedIncreasesAbove21(){
        automaticBike.powerOn();
        for(int counter = 0; counter < 21; counter++){
            automaticBike.accelerate();
        }
        assertEquals(2,automaticBike.getGear());
    }
    @Test
    public void test_myBikeCanSwitchToGear3AutomaticallyAsTheSpeedIncreasesAbove31(){
        automaticBike.powerOn();
        for(int counter = 0; counter < 31; counter++){
            automaticBike.accelerate();
        }
        assertEquals(3,automaticBike.getGear());
    }
    @Test
    public void test_myBikeCanSwitchToGear4AutomaticallyAsTheSpeedIncreasesAbove41(){
        automaticBike.powerOn();
        for(int counter = 0; counter < 41; counter++){
            automaticBike.accelerate();
        }
        assertEquals(4,automaticBike.getGear());
    }
    @Test
    public void test_thatMyBikeSpeedCAnDecelerate(){
        automaticBike.powerOn();
        automaticBike.accelerate();
        automaticBike.accelerate();
        automaticBike.brake();
        assertEquals(1,automaticBike.getGear());
    }
    @Test
    public void test_thatWhenMyBikeSpeedCAnDecelerateBy2AtGear2(){
        automaticBike.powerOn();
        for(int counter = 0; counter < 23; counter++){
            automaticBike.accelerate();
        }
        assertEquals(2,automaticBike.getGear());
        assertEquals(25,automaticBike.getSpeed());
        automaticBike.brake();
        assertEquals(2,automaticBike.getGear());
        assertEquals(23,automaticBike.getSpeed());

    }
    @Test
    public void test_thatWhenMyBikeSpeedCAnDecelerateBy3AtGear3(){
        automaticBike.powerOn();
        for(int counter = 0; counter < 31; counter++){
            automaticBike.accelerate();
        }
        assertEquals(3,automaticBike.getGear());
        assertEquals(31,automaticBike.getSpeed());
        automaticBike.brake();
       // assertEquals( ,automaticBike.getGear());
        //assertEquals(31,automaticBike.getSpeed());
    }


}
