package company.auth;

public class Permission {
	private String name;

	public Permission(String name) {
		this.name = name;
	}

	public void applyPermission(String employee) {
		System.out.println("Applying " + name + " permission to " + employee);
	}
}
