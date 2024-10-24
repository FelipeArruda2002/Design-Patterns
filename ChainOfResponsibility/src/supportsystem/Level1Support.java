package supportsystem;

public class Level1Support extends BaseHandler {
	
	@Override
    public void handleRequest(SupportRequest request) {
        if (request.getIssueType().equals("basic")) {
            System.out.println("Level 1 handling basic issue: " + request.getDescription());
        } else {
            System.out.println("Level 1 cannot handle this issue.");
            if (this.next != null) {
            	this.next.handleRequest(request);
            }
        }
    }
	
}

