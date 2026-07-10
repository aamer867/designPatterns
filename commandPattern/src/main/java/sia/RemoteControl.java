package sia;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Remote Control: \n");
        for(int i=0; i<=6; i++) {
            String s = "Slot " + i + "  " + onCommands[i] + "  " + offCommands[i] + "\n";
            sb.append(s);
        }
        return sb.toString();
    }

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
    }

    public void setCommandToSlot(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot].undo();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot].undo();
    }

    public void undoButtonWasPushed() {
        undoCommand.execute();
    }
}
