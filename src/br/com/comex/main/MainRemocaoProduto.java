package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoProduto {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();

		String sql = "DELETE FROM comex.PRODUTO WHERE id =  12";

		PreparedStatement ppstm = conexao.prepareStatement(sql);

		ppstm.execute();

		System.out.println("Produto removido com sucesso!!!");

		conexao.close();
		ppstm.close();

	}

}
