package command_pattern.undo;

public class NoCommand implements Command {

	public void execute() {}

	@Override
	public void undo() {}
}
