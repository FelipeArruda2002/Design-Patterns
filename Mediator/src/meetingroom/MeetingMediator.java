package meetingroom;

import java.util.Set;

public interface MeetingMediator {

	boolean reserveRoom(String roomName);

	void releaseRoom(String roomName);

	boolean isRoomAvailable(String roomName);

	void subscribeUser(String roomName, String username);

	Set<String> getSubscribers(String roomName);

	void notifyUser(String roomName, String message);

}
