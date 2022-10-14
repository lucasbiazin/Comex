package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainInsercaoProdutos {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();

		String nome = "Teclado mecânico";
		String descricao = "Gamer";
		Double preco_unitario = 700.00;
		Integer quantidade = 9;
		Integer categoria_id = 1;
		String tipo = "NAO_ISENTO";

		String sql = "INSERT INTO comex.PRODUTO"
				+ "(nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo)"
				+ " VALUES (? , ? , ?, ?, ?, ?)";

		PreparedStatement ppstm = conexao.prepareStatement(sql);

		ppstm.setString(1, nome);
		ppstm.setString(2, descricao);
		ppstm.setDouble(3, preco_unitario);
		ppstm.setInt(4, quantidade);
		ppstm.setInt(5, categoria_id);
		ppstm.setString(6, tipo);

		ppstm.execute();

		System.out.println("Produto inserido com sucesso!");

		conexao.close();
	}

}
