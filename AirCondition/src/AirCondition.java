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
        if (this.temperature < 30){
            this.temperature++;
        }
        return this.temperature;
    }
    public int decreaseTemperature(){
    if (this.temperature > 16){
        this.temperature--;
    }
        return this.temperature;
    }



}

