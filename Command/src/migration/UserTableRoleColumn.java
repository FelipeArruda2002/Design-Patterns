package migration;

public class UserTableRoleColumn implements MigrationCommand {

	@Override
	public void execute() {
		  System.out.println("Column ROLE added to table USER.");
	}

	@Override
	public void undo() {
		 System.out.println("Column ROLE removed from table USER.");
	}

}
