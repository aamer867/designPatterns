package sia;

public class FanSpeedMediumCommand extends FanSpeedCommand {

    public FanSpeedMediumCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.medium();
        System.out.println("FanSpeedMedium command executed");
    }

    @Override
    public String toString(){
        return "FanSpeedMediumCommand";
    }
}
