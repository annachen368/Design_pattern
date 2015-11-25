package command_pattern.undo;

/**
 * This remote is going to handle seven On and Off commands, which we'll hold in corresponding arrays.
 * @author Anna
 *
 */
public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[3];
		offCommands = new Command[3];
		
		NoCommand noCommand = new NoCommand();
		for(int i=0; i<onCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n--- Remote Control --- \n");
		for(int i=0; i<onCommands.length; i++) {
			sb.append("[slot "+i+"]"+onCommands[i].getClass().getName()+"  "+offCommands[i].getClass().getName()+"\n");
		}
		sb.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return sb.toString();
	}
}
