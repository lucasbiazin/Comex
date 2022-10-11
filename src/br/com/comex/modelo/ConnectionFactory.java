package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection criaConexao() throws SQLException {

		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
				"system", "1010");

	}

}
