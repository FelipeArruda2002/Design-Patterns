package company.config;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager = new ConfigurationManager();

        manager.setConfiguration("database_url", "jdbc:mysql://localhost:3306/mydb");
        manager.setConfiguration("max_connections", "10");
        manager.printConfigurations();

        manager.setConfiguration("max_connections", "20");
        manager.removeConfiguration("database_url");
        manager.printConfigurations();
    }
}
