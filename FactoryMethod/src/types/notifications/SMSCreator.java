package types.notifications;

public class SMSCreator implements NotificationFactory{

	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}

}
