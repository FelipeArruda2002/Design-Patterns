package requesthandler;

public abstract class BaseHandler implements Handler {
	
	protected Handler next;
	
	@Override
	public void setNext(Handler next) {
		if (this.next == null) {
			this.next = next;
		} else {
			this.next.setNext(next);
		}
	}
	
	public void processNext(Request request) {
		if (this.next != null) {
			this.next.process(request);
		} else {
			System.out.println("No handler available to process the request.");
		}
	}

}
