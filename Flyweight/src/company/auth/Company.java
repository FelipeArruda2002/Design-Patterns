package company.auth;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<Employee> employees = new ArrayList<>();

	public void addEmployee(String name, List<String> permissionNames) {
		Employee employee = new Employee(name);
		for (String permissionName : permissionNames) {
			employee.addPermission(permissionName);
		}
		employees.add(employee);
	}

	public void applyAllPermissions() {
		for (Employee employee : employees) {
			employee.applyPermissions();
		}
	}
}