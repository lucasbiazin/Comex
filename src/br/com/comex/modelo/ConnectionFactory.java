package br.com.comex.modelo;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String username = "system";
	String password = "alura";

	public DataSource dataSource;

	public ConnectionFactory() {

		try {
			ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setJdbcUrl(url);
			comboPooledDataSource.setUser(username);
			comboPooledDataSource.setPassword(password);

			this.dataSource = comboPooledDataSource;

		} catch (Exception erro) {
			System.err.println("Erro ao logar no banco de dados" + erro);
		}

	}

	public Connection criaConexao() {

		try {
			return this.dataSource.getConnection();
		} catch (Exception erro) {
			System.err.println("Erro inesperado enquanto pegava conexão " + erro);
		}
		return null;

	}

}