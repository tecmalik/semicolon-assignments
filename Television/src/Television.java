public class Television {
    private int volume;
    private int channel;
    private boolean isOn;

    public Television() {
        this.volume = 50;
        this.channel = 1;
        this.isOn = false;

    }
    public boolean isOn() {
        return this.isOn;
    }
    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }
    public int getVolume() {
        if (this.isOn == false) throw new IllegalStateException("Television must be on to get the volume.");
        return this.volume;
    }

    public void increaseVolume() {
        if (this.isOn == false) throw new IllegalStateException("television must be on to increasing the volume.");
        if (this.volume == 100) throw new IllegalStateException("maximum volume.");
        this.volume+=10;
    }
    public void decreaseVolume() {
        if (this.isOn == false) throw new IllegalStateException("Volume must be on to decrease the volume.");
        if (this.volume < 0) throw new IllegalStateException("minimum volume.");
        this.volume-=10;
    }


}