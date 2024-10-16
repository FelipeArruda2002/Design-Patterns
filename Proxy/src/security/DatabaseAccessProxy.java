package security;

public class DatabaseAccessProxy implements Database {

	private Database databaseAccess;

	public DatabaseAccessProxy(Database databaseAccess) {
		super();
		this.databaseAccess = databaseAccess;
	}

	@Override
	public void query(User user, String sql) {
		  if (!user.isAuthenticated()) {
	            System.out.println("User " + user.getUsername() + " is not authenticated. Access denied.");
	            return;
	        }

	        if (AccessLevel.GUEST.equals(user.getAccessLevel())) {
	            System.out.println("User " + user.getUsername() + " is a guest. Access denied.");
	            return;
	        }

	        if (AccessLevel.REGULAR_USER.equals(user.getAccessLevel()) && !sql.startsWith("SELECT")) {
	            System.out.println("User " + user.getUsername() + " has insufficient privileges to execute non-SELECT queries.");
	            return;
	        }

	        // Se passar todas as verificações, delega a execução para o objeto real
	        databaseAccess.query(user, sql);
	}

}