package migration;

public class Main {
    public static void main(String[] args) {
        DatabaseMigration migration = new DatabaseMigration();

        migration.addOperation(new UserTable());            // Creates "UserTable"
        migration.addOperation(new ProductTable());         // Creates "ProductTable"
        migration.addOperation(new UserTableRoleColumn());     // Adds "Role" column to "UserTable"
        
        migration.undoLastOperation();          // Removes "Role" column from "UserTable"
        migration.undoLastOperation();          // Drops "ProductTable"
        migration.undoLastOperation();          // Drops "UserTable"
    }
}

