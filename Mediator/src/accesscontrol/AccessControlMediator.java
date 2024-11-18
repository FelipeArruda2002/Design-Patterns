package accesscontrol;

public interface AccessControlMediator {
	
	void showLog(String message);
	void grantAccess(String username, String role);

}
