public class AirCondition {

    private boolean airConditionSwitch;
    private int temperature;

    public boolean offAirCondition() {
        this.airConditionSwitch = false;
        return false;
    }
    public boolean onAirCondition() {
        this.airConditionSwitch = true;
        return airConditionSwitch;
    }
    public int temperature(int degreeCelsius) {
        this.temperature = degreeCelsius;
        return temperature;
    }
    public int increaseTemperature(){
        this.temperature++;
        return this.temperature;
    }
    public int decreaseTemperature(){
        this.temperature--;
        return this.temperature;
    }


}

