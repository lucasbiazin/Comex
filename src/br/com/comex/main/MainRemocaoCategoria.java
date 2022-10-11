package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory fac = new ConnectionFactory();
		Connection conexao = fac.criaConexao();

		Statement stm = conexao.createStatement();

		stm.execute("DELETE FROM comex.CATEGORIA where status = 'INATIVA' ");

		System.out.println("Categoria removida com sucesso!!!");

		conexao.close();

	}

}
