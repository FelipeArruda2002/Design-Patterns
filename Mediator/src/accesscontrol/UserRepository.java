package accesscontrol;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
	
    private Map<String, String> users = new HashMap<>();
    private AccessControlMediator mediator; 

    public UserRepository(AccessControlMediator mediator) {
		this.mediator = mediator;
	}

	public void addUser(String username, String role) {
        users.put(username, role);
        mediator.showLog("User added: " + username);
        mediator.grantAccess(username, role);
    }

    public boolean userExists(String username) {
        return users.containsKey(username);
    }
}

