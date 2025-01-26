
public class AutomaticBike {

    private int power = 0;
    private int gear = 0;
    private int acceleration = 0;
    private int speed = 0;


    public boolean powerOff(){
        return this.power == 0 ;
    }

    public boolean powerOn() {
       return this.power == 1 ;
    }

    public int getGear() {
        return this.gear;
    }

    public int getAcceleration() {
        return this.acceleration;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void IncreaseGear() {
        this.gear++;
    }
}