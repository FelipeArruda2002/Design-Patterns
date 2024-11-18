package accesscontrol;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
	
    private Map<String, String> users = new HashMap<>();
    private AccessManager accessManager;
    private Logger logger;

    public UserRepository(AccessManager accessManager, Logger logger) {
        this.accessManager = accessManager;
        this.logger = logger;
    }

    public void addUser(String username, String role) {
        users.put(username, role);
        logger.log("User added: " + username);
        accessManager.grantAccess(username, role);
    }

    public boolean userExists(String username) {
        return users.containsKey(username);
    }
}

