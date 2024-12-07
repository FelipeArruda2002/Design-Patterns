package documentprocessing;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	public void addSubscriber(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}
	
	protected void notifySubscribers(Document document) {
	    for (Subscriber subscriber : subscribers) {
	        subscriber.update(document);
	    }
	}
	
}
