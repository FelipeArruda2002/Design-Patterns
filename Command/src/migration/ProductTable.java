package migration;

public class ProductTable implements MigrationCommand {

	@Override
	public void execute() {
		  System.out.println("Table PRODUCT created.");
	}

	@Override
	public void undo() {
	    System.out.println("Table PRODUCT dropped.");
	}

}
