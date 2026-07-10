package sia;

public class CeilingFan implements Fan {
    public final int HIGH;
    public final int MEDIUM;
    public final int LOW;
    private int speed;

    public CeilingFan() {
        this.HIGH = 100;
        this.MEDIUM = 50;
        this.LOW = 25;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = 0;
    }
    public int getSpeed() {
        return speed;
    }

}
