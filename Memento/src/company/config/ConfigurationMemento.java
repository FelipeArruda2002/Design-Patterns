package company.config;

import java.util.Map;

public class ConfigurationMemento {

	private final Map<String, String> configurations;

	public ConfigurationMemento(Map<String, String> configurations) {
		this.configurations = configurations;
	}

	public Map<String, String> getConfigurations() {
		return configurations;
	}
	
}
