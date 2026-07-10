package sia;

public class CeilingLight implements Light{
    @Override
    public void on() {
        System.out.println("Ceiling Light is on");
    }
    @Override
    public void off() {
        System.out.println("Ceiling Light is off");
    }
}
