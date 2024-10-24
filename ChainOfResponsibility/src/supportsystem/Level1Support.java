package supportsystem;

public class Level1Support {
	
    public void handleRequest(SupportRequest request) {
        if (request.getIssueType().equals("basic")) {
            System.out.println("Level 1 handling basic issue: " + request.getDescription());
        } else {
            System.out.println("Level 1 cannot handle this issue.");
        }
    }
}

