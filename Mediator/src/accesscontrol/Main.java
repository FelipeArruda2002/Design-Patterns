package accesscontrol;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        AccessManager accessManager = new AccessManager(null); // Inicialmente null, mas corrigiremos.
        ConcreteAccessControl mediator = new ConcreteAccessControl(accessManager, logger);

        accessManager.setMediator(mediator);

        UserRepository userRepository = new UserRepository(mediator);
        userRepository.addUser("john.doe", "ADMIN");
        userRepository.addUser("jane.doe", "USER");

        System.out.println("Role of john.doe: " + mediator.getRole("john.doe"));
    }
}
