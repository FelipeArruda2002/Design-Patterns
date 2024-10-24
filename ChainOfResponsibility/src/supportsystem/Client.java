package supportsystem;

public class Client {
	
    public static void main(String[] args) {
        SupportRequest basicRequest = new SupportRequest("basic", "Reset password");
        SupportRequest techRequest = new SupportRequest("technical", "System error");
        SupportRequest criticalRequest = new SupportRequest("critical", "Server down");

        Handler level1 = new Level1Support();
        Handler level2 = new Level2Support();
        Handler level3 = new Level3Support();

        level1.setNext(level2);
        level1.setNext(level3);
       
        System.out.println("Critical:");
        level1.handleRequest(criticalRequest);
        
        System.out.println("Technical:");
        level1.handleRequest(techRequest);
        
        System.out.println("Basic:");
        level1.handleRequest(basicRequest);
    }
}

