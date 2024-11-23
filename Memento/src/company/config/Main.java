package company.config;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager = new ConfigurationManager();
        Caretaker caretaker = new Caretaker();
        
        manager.setConfiguration("database_url", "jdbc:mysql://localhost:3306/mydb");
        manager.setConfiguration("max_connections", "10");
        caretaker.save(manager);
        manager.printConfigurations();

        manager.setConfiguration("max_connections", "20");
        caretaker.save(manager);
        manager.removeConfiguration("database_url");
        manager.printConfigurations();
        
        caretaker.undo(manager);
        manager.printConfigurations();
        
        caretaker.undo(manager);
        manager.printConfigurations();
    }
}
