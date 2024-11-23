package meetingroom;

public class Main {
	
	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		UserRegistry userRegistry = new UserRegistry();
		RoomManager roomManager = new RoomManager(null); // Temporariamente `null`.
		
		MeetingMediator meetingMediator = new MeetingMediatorImpl(roomManager, userRegistry, notificationService);
		
		// Agora, configuramos o mediator no RoomManager.
		roomManager.setMediator(meetingMediator);
		
		// Simulação sem o Mediator.
		String roomName = "Room A";
		String user = "john.doe";

		// Registrar o usuário.
		meetingMediator.subscribeUser(roomName, user);

		// Reservar a sala.
		meetingMediator.reserveRoom(roomName);

		// Liberar a sala.
		meetingMediator.releaseRoom(roomName);
	}
}
