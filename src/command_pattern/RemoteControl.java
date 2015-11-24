package command_pattern;

/**
 * This remote is going to handle seven On and Off commands, which we'll hold in corresponding arrays.
 * @author Anna
 *
 */
public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		//Command noCommand = new NoCommand();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n--- Remote Control --- \n");
		for(int i=0; i<onCommands.length; i++) {
			sb.append("[slot "+i+"]"+onCommands[i].getClass().getName()+"  "+offCommands[i].getClass().getName()+"\n");
		}
		return sb.toString();
	}
}
