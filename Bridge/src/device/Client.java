package device;

public class Client {

	public static void main(String[] args) {
		Device radio = new Radio();
		AdvancedRemote advancedRemote = new AdvancedRemote(radio);
	
		advancedRemote.togglePower();
		advancedRemote.togglePower();
		
		advancedRemote.volumeUp();
		advancedRemote.volumeUp();
		advancedRemote.volumeUp();
		advancedRemote.volumeUp();
		

	}

}
