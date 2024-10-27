package alexa;

import alexa.alexa.Alexa;

public class Client {

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
	}
}
