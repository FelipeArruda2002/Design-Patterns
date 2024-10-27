package alexa.alexa;

import alexa.Command;

public class Alexa {
	
	public void sendRequest(Command command, String request) {
		System.out.println(request);
		command.execute();
	}
}
