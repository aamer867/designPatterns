package sia;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
    public Command undo() {
        return new LightOffCommand(light);
    }
}
