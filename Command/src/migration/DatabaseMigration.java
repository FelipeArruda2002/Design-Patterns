package migration;

import java.util.Stack;

public class DatabaseMigration {
	private Stack<MigrationCommand> operationHistory;

	public DatabaseMigration() {
		operationHistory = new Stack<MigrationCommand>();
	}

	public void addOperation(MigrationCommand command) {
		command.execute();
		operationHistory.add(command);
	}

	public void undoLastOperation() {
		if (!operationHistory.isEmpty()) {
			operationHistory.pop().undo();
		}
	}
}
