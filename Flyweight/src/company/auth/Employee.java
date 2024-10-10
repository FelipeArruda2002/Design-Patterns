package company.auth;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Permission> permissions = new ArrayList<>();

	public Employee(String name) {
		this.name = name;
	}

	public void addPermission(String permissionName) {
		Permission permission = new Permission(permissionName); // Criação repetida de permissões
		permissions.add(permission);
	}

	public void applyPermissions() {
		for (Permission permission : permissions) {
			permission.applyPermission(name);
		}
	}
}
