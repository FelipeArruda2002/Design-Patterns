package alexa;

import alexa.lights.GenericLight;

public class TurnOffCommand implements Command {
	
	private GenericLight light;
	
	public TurnOffCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}

}
