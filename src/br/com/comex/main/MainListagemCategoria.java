package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();

		Statement stm = conexao.createStatement();

		stm.execute("SELECT  nome, status FROM comex.CATEGORIA");

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {

			String nome = rst.getString("NOME");
			System.out.println(nome);
			String status = rst.getString("STATUS");
			System.out.println(status);

		}
		conexao.close();
	}

}
