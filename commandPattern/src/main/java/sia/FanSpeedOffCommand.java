package sia;

public class FanSpeedOffCommand extends  FanSpeedCommand {
    public FanSpeedOffCommand(CeilingFan fan) {
        super(fan);
    }

    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
        System.out.println("FanSpeedOff command executed");
    }

    @Override
    public String toString(){
        return "FanSpeedOffCommand";
    }
}
