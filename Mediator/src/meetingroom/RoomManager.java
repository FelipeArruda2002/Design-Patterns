package meetingroom;

import java.util.HashMap;
import java.util.Map;

public class RoomManager {
    private Map<String, Boolean> rooms = new HashMap<>(); // true = disponível, false = reservada.

    public RoomManager() {
        rooms.put("Room A", true);
        rooms.put("Room B", true);
        rooms.put("Room C", true);
    }

    public boolean reserveRoom(String roomName) {
        if (rooms.containsKey(roomName) && rooms.get(roomName)) {
            rooms.put(roomName, false);
            return true;
        }
        return false;
    }

    public void releaseRoom(String roomName) {
        if (rooms.containsKey(roomName)) {
            rooms.put(roomName, true);
        }
    }

    public boolean isRoomAvailable(String roomName) {
        return rooms.getOrDefault(roomName, false);
    }
}
