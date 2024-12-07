package stockmonitoring;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	public void addSubscriber(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}
	
	public void addSubscribers(Subscriber... subscribers) {
	    for (Subscriber subscriber : subscribers) {
	        addSubscriber(subscriber);
	    }
	}
	
	protected void notifySubscribers(Product product) {
		for (Subscriber subscriber: subscribers) {
			subscriber.update(product);
		}
	}
	
}
