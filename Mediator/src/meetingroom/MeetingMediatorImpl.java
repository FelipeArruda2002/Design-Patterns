package meetingroom;

import java.util.Set;

public class MeetingMediatorImpl implements MeetingMediator {

	private RoomManager manager;
	private UserRegistry userRegistry;
	private NotificationService notificationService;
	
	public MeetingMediatorImpl(RoomManager manager, UserRegistry userRegistry,
			NotificationService notificationService) {
		this.manager = manager;
		this.userRegistry = userRegistry;
		this.notificationService = notificationService;
	}

	@Override
	public boolean reserveRoom(String roomName) {
		return manager.reserveRoom(roomName);
	}

	@Override
	public void releaseRoom(String roomName) {
		manager.releaseRoom(roomName);
	}

	@Override
	public boolean isRoomAvailable(String roomName) {
		return manager.isRoomAvailable(roomName);
	}

	@Override
	public void subscribeUser(String roomName, String username) {
		userRegistry.subscribeUser(roomName, username);
	}

	@Override
	public Set<String> getSubscribers(String roomName) {
		return userRegistry.getSubscribers(roomName);
	}

	@Override
	public void notifyUser(String roomName, String message) {
		Set<String> subscribers = getSubscribers(roomName);
		subscribers.forEach(s -> notificationService.notifyUser(s + " " + message));
	}

}
