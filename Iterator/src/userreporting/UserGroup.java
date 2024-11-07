package userreporting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserGroup {
	
	private List<User> users = new ArrayList<>();

	public void addUser(User user) {
		users.add(user);
	}

	// Método básico para obter usuários ativos
	public List<User> getActiveUsers() {
		List<User> activeUsers = new ArrayList<>();
		for (User user : users) {
			if (user.isActive()) {
				activeUsers.add(user);
			}
		}
		return activeUsers;
	}

	// Funcionalidade 1: Contador de usuários ativos
	public int getActiveUserCount() {
		int count = 0;
		for (User user : users) {
			if (user.isActive()) {
				count++;
			}
		}
		return count;
	}

	// Funcionalidade 2: Filtro por prefixo de nome
	public List<User> getActiveUsersStartingWith(String prefix) {
		List<User> filteredUsers = new ArrayList<>();
		for (User user : users) {
			if (user.isActive() && user.getName().startsWith(prefix)) {
				filteredUsers.add(user);
			}
		}
		return filteredUsers;
	}

	// Funcionalidade 3: Listar usuários ativos criados antes de uma data
	public List<User> getActiveUsersCreatedBefore(LocalDate date) {
		List<User> filteredUsers = new ArrayList<>();
		for (User user : users) {
			if (user.isActive() && user.getCreationDate().isBefore(date)) {
				filteredUsers.add(user);
			}
		}
		return filteredUsers;
	}

	// Funcionalidade 4: Desativar usuário por nome
	public void deactivateUser(String userName) {
		for (User user : users) {
			if (user.getName().equals(userName)) {
				user.deactivate();
				break;
			}
		}
	}
}
