package documentprocessing;

public class NotificationSystem implements Subscriber {

	@Override
	public void update(Document document) {
		System.out.println(document.getTitle() + " teve seu status alterado");
	}

}
