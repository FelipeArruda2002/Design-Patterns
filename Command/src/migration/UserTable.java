package migration;

public class UserTable implements MigrationCommand {

	@Override
	public void execute() {
		  System.out.println("Table USER created.");
	}

	@Override
	public void undo() {
		System.out.println("Table USER dropped.");
	}

}
