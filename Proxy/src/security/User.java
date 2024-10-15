package security;

// Classe User que representa o usuário que vai tentar acessar o banco de dados
public class User {
	
	private String username;
	private boolean isAuthenticated;
	private AccessLevel accessLevel;

	public User(String username, boolean isAuthenticated, AccessLevel accessLevel) {
		this.username = username;
		this.isAuthenticated = isAuthenticated;
		this.accessLevel = accessLevel;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public AccessLevel getAccessLevel() {
		return accessLevel;
	}
}