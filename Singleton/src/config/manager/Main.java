package config.manager;

public class Main {

	public static void main(String[] args) {
		ConfigManager configManager = ConfigManager.getInstance();
        configManager.loadConfigurations();
        
        String url = configManager.getConfig("url");
        System.out.println("URL: " + url);
        
        String timeout = configManager.getConfig("timeout");
        System.out.println("Timeout: " + timeout);
	}

}
