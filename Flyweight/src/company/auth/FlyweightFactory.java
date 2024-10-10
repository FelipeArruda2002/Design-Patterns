package company.auth;

import java.util.HashMap;

public class FlyweightFactory {
	
	private static final FlyweightFactory INSTANCE = new FlyweightFactory();
	private HashMap<String, Permission> permissions = new HashMap<>();
	
	private FlyweightFactory() {
	}
	
	public static FlyweightFactory getInstance() {
		return INSTANCE;
	}
	
	
	public Permission getPermission(String permissionName) {
		if (!permissions.containsKey(permissionName)) {
			permissions.put(permissionName, new Permission(permissionName));
		}
		return permissions.get(permissionName);
	}

}
