import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestAirCondition {
    @Test
    public void test() {
        AirCondition airCondition = new AirCondition();
    }
    @Test
    public void test_AirConditionIsOff() {
        AirCondition airCondition = new AirCondition();
        airCondition.offAirCondition();
        assertFalse(airCondition.offAirCondition());
    }
    @Test
    public void test_AirConditionIsOn() {
        AirCondition airCondition = new AirCondition();
        airCondition.onAirCondition();
        assertTrue(airCondition.onAirCondition());
    }
    @Test
    public void test_AirConditionHasTemperature() {
        AirCondition airCondition = new AirCondition();
        airCondition.temperature(24);
        assertEquals(24,airCondition.temperature(24));
    }
   @Test
    public void test_AirConditionIncreaseTemperature() {
        AirCondition airCondition = new AirCondition();
        airCondition.temperature(24);
        assertEquals(25,airCondition.increaseTemperature());
    }
   @Test
    public void test_AirConditionDecreaseTemperature() {
        AirCondition airCondition = new AirCondition();
        airCondition.temperature(24);
        assertEquals(23,airCondition.decreaseTemperature());

    }
    @Test
    public void test_ifAirConditionMaxIs30(){
        AirCondition airCondition = new AirCondition();
        airCondition.temperature(30);
        airCondition.increaseTemperature();
        assertEquals(30,airCondition.temperature(30));
    }
    @Test
    public void test_ifAirConditionMinIs16(){
        AirCondition airCondition = new AirCondition();
        airCondition.temperature(16);
        airCondition.decreaseTemperature();
        assertEquals(16,airCondition.temperature(16));
    }


}
