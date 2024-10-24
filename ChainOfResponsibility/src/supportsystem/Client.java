package supportsystem;

public class Client {
	
    public static void main(String[] args) {
        SupportRequest basicRequest = new SupportRequest("basic", "Reset password");
        SupportRequest techRequest = new SupportRequest("technical", "System error");
        SupportRequest criticalRequest = new SupportRequest("critical", "Server down");

        Level1Support level1 = new Level1Support();
        Level2Support level2 = new Level2Support();
        Level3Support level3 = new Level3Support();

        level1.handleRequest(basicRequest);
        level2.handleRequest(techRequest);
        level3.handleRequest(criticalRequest);
    }
}

