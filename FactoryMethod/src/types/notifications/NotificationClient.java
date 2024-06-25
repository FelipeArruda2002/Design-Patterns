package types.notifications;

public class NotificationClient {

	public static void main(String[] args) {
		NotificationFactory factory;
		Notification notification;

		factory = new SMSCreator();
		notification = factory.createNotification();
		notification.notifyUser();
		
		factory = new EmailCreator();
		notification = factory.createNotification();
		notification.notifyUser();
		
	}

}
