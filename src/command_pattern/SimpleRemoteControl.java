package command_pattern;

/**
 * Simple Remote Control
 * @author Anna
 * 
 */
public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
