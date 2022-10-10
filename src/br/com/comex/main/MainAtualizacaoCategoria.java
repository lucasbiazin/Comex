package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();

		Statement stm = conexao.createStatement();

		stm.execute("DELETE comex.CATEGORIA  WHERE ID = 'INATIVA'");
		
		System.out.println("Alterado com sucesso!!!");
		
		conexao.close();
		
		
	}

}
