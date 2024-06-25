package types.notifications;

public class EmailCreator implements NotificationFactory {

	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}

}
