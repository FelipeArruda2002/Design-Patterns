package alexa;

import alexa.alexa.Alexa;
import alexa.lights.PhillipsHueLight;
import alexa.lights.XiaomiLight;

public class Client {

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		
		alexa.sendRequest(new TurnOnCommand(new PhillipsHueLight()), "Turnning on the Living room light");
		alexa.sendRequest(new TurnOffCommand(new XiaomiLight()), "Turnning off the Kitchen light");
		
	}
}
