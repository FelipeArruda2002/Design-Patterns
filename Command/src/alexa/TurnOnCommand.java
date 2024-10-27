package alexa;

import alexa.lights.GenericLight;

public class TurnOnCommand implements Command {
	
	private GenericLight light;
	
	public TurnOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}

}
