package accesscontrol;

public class Main {
	
    public static void main(String[] args) {
        Logger logger = new Logger();
        AccessManager accessManager = new AccessManager(logger);
        UserRepository userRepository = new UserRepository(accessManager, logger);

        userRepository.addUser("john.doe", "ADMIN");
        userRepository.addUser("jane.doe", "USER");

        System.out.println("Role of john.doe: " + accessManager.getRole("john.doe"));
    }
}

