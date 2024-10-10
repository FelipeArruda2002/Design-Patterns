package company.auth;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Permission> permissions = new ArrayList<>();
	private FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

	public Employee(String name) {
		this.name = name;
	}

	public void addPermission(String permissionName) {
		permissions.add(flyweightFactory.getPermission(permissionName));
	}

	public void applyPermissions() {
		for (Permission permission : permissions) {
			permission.applyPermission(name);
		}
	}
}
