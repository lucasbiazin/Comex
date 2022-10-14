package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection criaConexao() {

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "1010";

			return DriverManager.getConnection(url, username, password);
		
		
		} catch (SQLException erro) {
			throw new RuntimeException(erro);
		}
	}

}
