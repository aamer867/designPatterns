package sia;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
    public Command undo() {
        return new LightOnCommand(light);
    }

    @Override
    public String toString() {
        return "Light off Command";
    }
}
