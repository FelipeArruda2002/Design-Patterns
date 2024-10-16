package security;

//Classe DatabaseAccess que simula o acesso a um banco de dados sensível
public class DatabaseAccess implements Database {
	
	@Override
	public void query(User user, String sql) {
        System.out.println(user.getUsername() + " is executing query: " + sql);
        // Simulação da execução de uma consulta ao banco de dados
    }
}
