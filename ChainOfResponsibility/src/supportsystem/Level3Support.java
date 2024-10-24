package supportsystem;

public class Level3Support {
	
    public void handleRequest(SupportRequest request) {
        if (request.getIssueType().equals("critical")) {
            System.out.println("Level 3 handling critical issue: " + request.getDescription());
        } else {
            System.out.println("Level 3 cannot handle this issue.");
        }
    }
}

