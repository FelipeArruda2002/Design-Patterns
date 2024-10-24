package supportsystem;

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

}
