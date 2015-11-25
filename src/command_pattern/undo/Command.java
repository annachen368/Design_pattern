package command_pattern.undo;

public interface Command {
	public void execute();
	public void undo();
}
