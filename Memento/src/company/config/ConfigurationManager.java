package company.config;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private Map<String, String> configurations = new HashMap<>();

    public void setConfiguration(String key, String value) {
        configurations.put(key, value);
    }

    public void removeConfiguration(String key) {
        configurations.remove(key);
    }

    public Map<String, String> getConfigurations() {
        return new HashMap<>(configurations);
    }

    public void printConfigurations() {
        System.out.println("Current Configurations: " + configurations);
    }
}

