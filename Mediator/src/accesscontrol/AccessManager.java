package accesscontrol;

import java.util.HashMap;
import java.util.Map;

public class AccessManager {
    private Map<String, String> permissions = new HashMap<>();
    private AccessControlMediator mediator;

    public AccessManager(AccessControlMediator mediator) {
		this.mediator = mediator;
	}

	public void grantAccess(String username, String role) {
        permissions.put(username, role);
        mediator.showLog("Access granted to " + username + " with role " + role);
    }
	
	public String getRole(String username) {
        return permissions.get(username);
    }
	
	public void setMediator(AccessControlMediator mediator) {
	    this.mediator = mediator;
	}
}
