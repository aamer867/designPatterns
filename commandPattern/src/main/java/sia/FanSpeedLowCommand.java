package sia;

public class FanSpeedLowCommand extends FanSpeedCommand {

    public FanSpeedLowCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.low();
        System.out.println("FanSpeedLow command executed");
    }

    @Override
    public String toString() {
        return "FanSpeedLowCommand";
    }

}
