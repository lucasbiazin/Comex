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

		boolean rst = stm.execute("UPDATE comex.CATEGORIA SET nome = 'LIVROS TÉCNICOS' WHERE id = 3");
		System.out.println(rst);

		System.out.println("Alterado com sucesso!!!");

		conexao.close();

	}

}
