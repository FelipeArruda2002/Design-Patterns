package company.auth;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Company company = new Company();

        // Adicionando funcionários com permissões repetidas
        company.addEmployee("Alice", Arrays.asList("READ", "WRITE"));
        company.addEmployee("Bob", Arrays.asList("READ", "WRITE"));
        company.addEmployee("Charlie", Arrays.asList("ADMIN", "READ"));
        company.addEmployee("Diana", Arrays.asList("ADMIN", "WRITE"));

        // Aplicando todas as permissões
        company.applyAllPermissions();
    }
}

