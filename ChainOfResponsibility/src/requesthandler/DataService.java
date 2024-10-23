package requesthandler;

public class DataService extends BaseHandler {
	
	@Override
    public void process(Request request) {
        if (request.getType().equals("DATA")) {
            System.out.println("Processing data request: " + request.getData());
        } else {
            System.out.println("DataService cannot handle the request.");
            processNext(request);
        }
    }
}

