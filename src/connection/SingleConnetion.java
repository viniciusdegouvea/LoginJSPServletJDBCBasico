package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * conexão com o banco de dados
 * 
*/

public class SingleConnetion {
	
	private static String banco = "";
	private static String user = "";
	private static String senha = "";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnetion() {
		conectar();
	}
	
	private static void conectar() {
		try {
			
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco, user, senha);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar com o banco de dados");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
