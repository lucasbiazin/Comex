package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();

		String sql = "SELECT  nome, status FROM comex.CATEGORIA";

		PreparedStatement ppstm = conexao.prepareStatement(sql);
		ResultSet rst = ppstm.executeQuery();

		while (rst.next()) {

			String nome = rst.getString("NOME");
			String status = rst.getString("STATUS");
			System.out.println(nome + ": " + status);

		}
		conexao.close();
		ppstm.close();
		rst.close();
	}

}
