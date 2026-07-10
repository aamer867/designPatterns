package sia;

public interface Command {
    void execute();
    Command undo();
}
