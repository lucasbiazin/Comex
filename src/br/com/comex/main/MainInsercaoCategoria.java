package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();

		Statement stm = conexao.createStatement();
		
		
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('INFORMÁTICA', 'ATIVA')");
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('MÓVEIS', 'INATIVA')");
		stm.execute("INSERT INTO comex.CATEGORIA(nome, status) VALUES ('LIVROS', 'ATIVA')");
		
		System.out.println("Categoria inserida com sucesso!");
		
		conexao.close();

	}

}
