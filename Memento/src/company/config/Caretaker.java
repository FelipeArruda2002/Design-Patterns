package company.config;

import java.util.Stack;

public class Caretaker {
	
	private Stack<ConfigurationMemento> history = new Stack<ConfigurationMemento>();
	
	public void undo(ConfigurationManager configurationManager) {
		if (history.isEmpty()) {
			System.out.println("No state to undo!");
			return;
		}
		configurationManager.restore(history.pop());
	}
	
	public void save(ConfigurationManager configurationManager) {
		history.push(configurationManager.save());
	}
	
}
