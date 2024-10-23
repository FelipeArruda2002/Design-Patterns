package requesthandler;

public class Client {
	
    public static void main(String[] args) {
        Request authRequest = new Request("AUTH", "User login data");
        Request logRequest = new Request("LOG", "Log error message");
        Request dataRequest = new Request("DATA", "Retrieve user info");
        
        Handler authService = new AuthService();
        Handler loggingService = new LoggingService();
        Handler dataService = new DataService();

        authService.setNext(dataService);
        authService.setNext(loggingService);
        
        System.out.println("Data request:");
        authService.process(dataRequest);
       
        System.out.println("Logging request:");
        authService.process(logRequest);
        
        System.out.println("Auth request:");
        authService.process(authRequest);
    }
}

