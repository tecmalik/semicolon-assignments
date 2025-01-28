
public class AutomaticBike {

    private int power = 0;
    private int gear = 0;
    private int acceleration = 0;
    private int speed = 0;


    public boolean powerIsOff(){
        return this.power == 0 ;
    }

    public boolean powerIsOn() {
       return this.power == 1 ;
    }

    public void powerOn() {
        this.power = 1;
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

    public void increaseGear() {
        if (powerIsOn()) {
            this.gear++;
        }

    }

    public void accelerate() {
        if (powerIsOn()) {
            if( this.gear == 0 ){
                increaseGear();
            }
             this.speed+=gear;

            if (this.speed == 21) {
                 this.gear++;
             }
             else if (this.speed == 31) {
                 this.gear++;
             }
             else if (this.speed == 40) {
                 this.gear++;
            }


        }
    }

    public void powerOff() {
        this.power = 0;
    }

    public void brake() {
        this.speed-=gear;

        if (this.speed == 21) {
            this.gear--;
        }
        else if (this.speed == 31) {
            this.gear--;
        }
        else if (this.speed == 40) {
            this.gear--;
        }


    }
}