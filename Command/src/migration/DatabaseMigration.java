package migration;

import java.util.Stack;

public class DatabaseMigration {
    private Database database;
    private Stack<String> operationHistory;

    public DatabaseMigration(Database database) {
        this.database = database;
        this.operationHistory = new Stack<>();
    }

    public void createUserTable() {
        database.createTable("UserTable");
        operationHistory.push("CREATE_TABLE UserTable");
    }

    public void createProductTable() {
        database.createTable("ProductTable");
        operationHistory.push("CREATE_TABLE ProductTable");
    }

    public void addUserTableRoleColumn() {
        database.addColumn("UserTable", "Role");
        operationHistory.push("ADD_COLUMN UserTable Role");
    }

    public void undoLastOperation() {
        if (!operationHistory.isEmpty()) {
            String lastOperation = operationHistory.pop();
            String[] parts = lastOperation.split(" ");
            String operation = parts[0];
            String tableName = parts[1];

            switch (operation) {
                case "CREATE_TABLE":
                    database.dropTable(tableName);
                    break;
                case "ADD_COLUMN":
                    String columnName = parts[2];
                    database.removeColumn(tableName, columnName);
                    break;
            }
        }
    }
}

