package security;

//Classe DatabaseAccess que simula o acesso a um banco de dados sensível
public class DatabaseAccess {
	public void query(String sql) {
		System.out.println("Executing query: " + sql);
		// Simulação da execução de uma consulta ao banco de dados
	}
}
