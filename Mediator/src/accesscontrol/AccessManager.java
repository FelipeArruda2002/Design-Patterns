package accesscontrol;

import java.util.HashMap;
import java.util.Map;

public class AccessManager {
    private Map<String, String> permissions = new HashMap<>();
    private Logger logger;

    public AccessManager(Logger logger) {
        this.logger = logger;
    }

    public void grantAccess(String username, String role) {
        permissions.put(username, role);
        logger.log("Access granted to " + username + " with role " + role);
    }

    public String getRole(String username) {
        return permissions.get(username);
    }
}
