package security;

public class Client {
	
	public static void main(String[] args) {
		Database dbAccess = new DatabaseAccessProxy(new DatabaseAccess());
		User admin = new User("admin_user", true, AccessLevel.ADMIN);
		User regularUser = new User("regular_user", true, AccessLevel.REGULAR_USER);
		User guest = new User("guest_user", true, AccessLevel.GUEST);

		// Testando a execução de consultas com diferentes usuários
        System.out.println("Admin trying to run queries:");
        dbAccess.query(admin, "SELECT * FROM sensitive_data"); // Admin pode executar qualquer consulta
        dbAccess.query(admin, "DELETE FROM sensitive_data");  // Admin pode executar essa consulta
        dbAccess.query(admin, "INSERT INTO sensitive_data VALUES (...)"); // Admin pode executar essa

        System.out.println("\nRegular user trying to run queries:");
        dbAccess.query(regularUser, "SELECT * FROM sensitive_data"); // Regular user pode executar consulta de leitura
        dbAccess.query(regularUser, "DELETE FROM sensitive_data");  // Regular user não pode executar consultas de escrita

        System.out.println("\nGuest trying to run queries:");
        dbAccess.query(guest, "SELECT * FROM sensitive_data"); // Guest não pode executar nenhuma consulta
	}
	
}
