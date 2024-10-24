package supportsystem;

public class Level2Support extends BaseHandler {
	
	@Override
    public void handleRequest(SupportRequest request) {
        if (request.getIssueType().equals("technical")) {
            System.out.println("Level 2 handling technical issue: " + request.getDescription());
        } else {
            System.out.println("Level 2 cannot handle this issue.");
            if (this.next != null) {
            	this.next.handleRequest(request);
            }
        }
    }
}

