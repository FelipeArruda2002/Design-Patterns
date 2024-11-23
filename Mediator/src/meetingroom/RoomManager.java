package meetingroom;

import java.util.HashMap;
import java.util.Map;

public class RoomManager {
	private MeetingMediator mediator;
    private Map<String, Boolean> rooms = new HashMap<>(); // true = disponível, false = reservada.

    public RoomManager(MeetingMediator mediator) {
        this.mediator = mediator;
        rooms.put("Room A", true);
        rooms.put("Room B", true);
        rooms.put("Room C", true);
    }

    public boolean reserveRoom(String roomName) {
    	if (rooms.containsKey(roomName) && rooms.get(roomName)) {
    	    rooms.put(roomName, false);
    	    mediator.notifyUser(roomName, "Room " + roomName + " successfully reserved.");
    	    return true;
    	} else {
    	    mediator.notifyUser(roomName, "Room " + roomName + " is not available.");
    	    return false;
    	}
    }
    
    public void releaseRoom(String roomName) {
        if (rooms.containsKey(roomName)) {
            rooms.put(roomName, true);
            mediator.notifyUser(roomName, roomName + " is now available.");
        }
    }

    public boolean isRoomAvailable(String roomName) {
        return rooms.getOrDefault(roomName, false);
    }

	public void setMediator(MeetingMediator mediator) {
		this.mediator = mediator;
	}
    
}
