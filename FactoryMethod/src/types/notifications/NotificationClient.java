package types.notifications;

public class NotificationClient {

	public static void main(String[] args) {
		EmailNotification emailNotification = new EmailNotification();
		emailNotification.notifyUser();

		SMSNotification smsNotification = new SMSNotification();
		smsNotification.notifyUser();
	}

}
