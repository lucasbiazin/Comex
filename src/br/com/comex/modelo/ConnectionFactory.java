package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static java.sql.Connection criaConexao() throws  SQLException {
		Connection connection = null;

		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "1010";

	
		connection = DriverManager.getConnection(url, username, password);

		System.out.println("Conexão efetuada com sucesso!!!!");

	 
		return connection;
		

	}
	
}
