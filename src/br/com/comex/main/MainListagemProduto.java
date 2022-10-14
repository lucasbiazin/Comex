package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainListagemProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection conexao = factory.criaConexao();
		String sql = "SELECT  * FROM comex.PRODUTO";

		PreparedStatement ppstm = conexao.prepareStatement(sql);
		ResultSet rst = ppstm.executeQuery();

		while (rst.next()) {
			Integer id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			Double preco = rst.getDouble("PRECO_UNITARIO");
			Integer quantidade = rst.getInt("QUANTIDADE_ESTOQUE");
			Integer categoriaID = rst.getInt("CATEGORIA_iD");
			String tipo = rst.getString("TIPO");

			System.out.println("Lista de produtos");
			System.out.println("");
			System.out.println("ID: " + id + "| " + nome + "| " + descricao + "| R$ " + preco + "| " + quantidade + "| "
					+ categoriaID + "| " + tipo);

		}
		conexao.close();
		ppstm.close();
		rst.close();
	}

}
