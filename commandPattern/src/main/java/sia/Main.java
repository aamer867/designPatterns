package sia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RemoteControl rm = new RemoteControl();
        CeilingLight cl = new CeilingLight();
        LightOnCommand loc = new LightOnCommand(cl);
        LightOffCommand lof = new LightOffCommand(cl);
        rm.setCommandToSlot(0, loc, lof);
        System.out.println(rm);

        CeilingFan fan = new CeilingFan();
        FanSpeedHighCommand fshc = new FanSpeedHighCommand(fan);
        FanSpeedMediumCommand fsmc = new FanSpeedMediumCommand(fan);
        FanSpeedLowCommand fslc = new FanSpeedLowCommand(fan);
        FanSpeedOffCommand fsco = new FanSpeedOffCommand(fan);

        rm.setCommandToSlot(1, fshc, fsco);
        rm.setCommandToSlot(2, fsmc, fsco);
        rm.setCommandToSlot(3, fslc, fsco);

        System.out.println(rm);

        rm.onButtonWasPushed(0);
        rm.offButtonWasPushed(0);
        rm.undoButtonWasPushed();
        System.out.println();
        rm.onButtonWasPushed(1);
        rm.offButtonWasPushed(1);
        rm.undoButtonWasPushed();
        System.out.println();
        rm.onButtonWasPushed(2);
        rm.offButtonWasPushed(2);
        rm.undoButtonWasPushed();
        System.out.println();
        rm.onButtonWasPushed(3);
        rm.offButtonWasPushed(3);
        rm.undoButtonWasPushed();
        System.out.println();
    }
}