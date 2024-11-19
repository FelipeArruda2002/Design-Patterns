package meetingroom;

public class Main {
	
	public static void main(String[] args) {
		RoomManager roomManager = new RoomManager();
		NotificationService notificationService = new NotificationService();
		UserRegistry userRegistry = new UserRegistry();

		// Simulação sem o Mediator.
		String roomName = "Room A";
		String user = "john.doe";

		// Registrar o usuário.
		userRegistry.subscribeUser(roomName, user);

		// Reservar a sala.
		if (roomManager.reserveRoom(roomName)) {
			notificationService.notifyUser(user + " reserved " + roomName);
		} else {
			notificationService.notifyUser(roomName + " is not available.");
		}

		// Liberar a sala.
		roomManager.releaseRoom(roomName);
		notificationService.notifyUser(roomName + " is now available.");
	}
}
