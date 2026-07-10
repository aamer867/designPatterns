package sia;

public abstract class FanSpeedCommand implements Command {
    protected CeilingFan fan;
    protected int prevSpeed;

    public FanSpeedCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public Command undo() {
        if (prevSpeed == fan.HIGH) {
            return new FanSpeedHighCommand(fan);
        } else if (prevSpeed == fan.MEDIUM) {
            return new FanSpeedMediumCommand(fan);
        } else if (prevSpeed == fan.LOW) {
            return new FanSpeedLowCommand(fan);
        } else if (prevSpeed == 0) {
            return new FanSpeedOffCommand(fan);
        }
        return null;
    }


}
