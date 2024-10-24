package supportsystem;

public interface Handler {

	void handleRequest(SupportRequest request);
	void setNext(Handler next);
	
}
