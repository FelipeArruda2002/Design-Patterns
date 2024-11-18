package accesscontrol;

public class ConcreteAccessControl implements AccessControlMediator {
	
	private AccessManager accessManager;
	private Logger logger;
	
	public ConcreteAccessControl(AccessManager accessManager, Logger logger) {
        this.accessManager = accessManager;
        this.logger = logger;
    }

	@Override
	public void showLog(String message) {
		logger.log(message);
	}

	@Override
	public void grantAccess(String username, String role) {
		accessManager.grantAccess(username, role);
	}
	
	public String getRole(String username) {
        return accessManager.getRole(username);
    }

}
