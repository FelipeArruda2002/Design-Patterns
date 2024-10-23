package requesthandler;

public interface Handler {

	void process(Request request);
	void setNext(Handler next);
	
}
