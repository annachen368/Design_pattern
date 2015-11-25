package command_pattern.undo;

public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		this.light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
