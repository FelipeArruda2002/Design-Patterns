package meetingroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserRegistry {
	
    private Map<String, Set<String>> roomSubscribers = new HashMap<>();

    public void subscribeUser(String roomName, String username) {
        roomSubscribers.computeIfAbsent(roomName, k -> new HashSet<>()).add(username);
    }

    public Set<String> getSubscribers(String roomName) {
        return roomSubscribers.getOrDefault(roomName, new HashSet<>());
    }

}

