package migration;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        DatabaseMigration migration = new DatabaseMigration(database);

        migration.createUserTable();            // Creates "UserTable"
        migration.createProductTable();         // Creates "ProductTable"
        migration.addUserTableRoleColumn();     // Adds "Role" column to "UserTable"

        migration.undoLastOperation();          // Removes "Role" column from "UserTable"
        migration.undoLastOperation();          // Drops "ProductTable"
        migration.undoLastOperation();          // Drops "UserTable"
    }
}

