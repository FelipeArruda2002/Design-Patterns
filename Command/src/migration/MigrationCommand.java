package migration;

public interface MigrationCommand {

	void  execute();
	void undo();
	
}
