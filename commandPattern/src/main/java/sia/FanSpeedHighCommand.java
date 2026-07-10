package sia;

public class FanSpeedHighCommand extends FanSpeedCommand {

    public FanSpeedHighCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.high();
        System.out.println("FanSpeedHIGH command executed");
    }

    @Override
    public String toString() {
        return "FanSpeedHighCommand";
    }

}
