package requesthandler;

public class Client {
	
    public static void main(String[] args) {
        Request authRequest = new Request("AUTH", "User login data");
        Request logRequest = new Request("LOG", "Log error message");
        Request dataRequest = new Request("DATA", "Retrieve user info");

        AuthService authService = new AuthService();
        LoggingService loggingService = new LoggingService();
        DataService dataService = new DataService();

        authService.process(authRequest);
        loggingService.process(logRequest);
        dataService.process(dataRequest);
    }
}

