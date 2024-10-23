package requesthandler;

public class LoggingService {
   
	public void process(Request request) {
        if (request.getType().equals("LOG")) {
            System.out.println("Processing log: " + request.getData());
        } else {
            System.out.println("LoggingService cannot handle the request.");
        }
    }
}

