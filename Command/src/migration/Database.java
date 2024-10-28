package migration;

public class Database {

    public void createTable(String tableName) {
        System.out.println("Table '" + tableName + "' created.");
    }

    public void addColumn(String tableName, String columnName) {
        System.out.println("Column '" + columnName + "' added to table '" + tableName + "'.");
    }

    public void dropTable(String tableName) {
        System.out.println("Table '" + tableName + "' dropped.");
    }

    public void removeColumn(String tableName, String columnName) {
        System.out.println("Column '" + columnName + "' removed from table '" + tableName + "'.");
    }
}
