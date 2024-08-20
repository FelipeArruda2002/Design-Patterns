package config.manager;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

	private static ConfigManager SINGLETON = null;
	private Map<String, String> configs = new HashMap<>();
	private boolean isLoaded = false;

	private ConfigManager() {
	}

	public static ConfigManager getInstance() {
		if (SINGLETON == null) {
			SINGLETON = new ConfigManager();
		}
		return SINGLETON;
	}

	public void loadConfigurations() {
		if (!isLoaded) {
			configs.put("url", "http://localhost");
			configs.put("timeout", "30");
			isLoaded = true;
		}
	}

	public String getConfig(String key) {
		return configs.getOrDefault(key, "Configuração não encontrada ou não carregada.");
	}

}
