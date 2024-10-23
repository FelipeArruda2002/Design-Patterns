package requesthandler;

public class AuthService {

	public void process(Request request) {
		if (request.getType().equals("AUTH")) {
			System.out.println("Processing authentication: " + request.getData());
		} else {
			System.out.println("AuthService cannot handle the request.");
		}
	}
}
