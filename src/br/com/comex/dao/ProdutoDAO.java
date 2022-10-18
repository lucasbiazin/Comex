	package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.enums.TipoProduto;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class ProdutoDAO {

	private Connection conexao;

	public ProdutoDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void salvar(Produto produto) throws SQLException {

		String sql = "INSERT INTO comex.PRODUTO"
				+ "(id, nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo)"
				+ " VALUES (?, ? , ? , ?, ?, ?, ?)";

		PreparedStatement pstm = conexao.prepareStatement(sql);

		pstm.setInt(1, produto.getId());
		pstm.setString(2, produto.getNome());
		pstm.setString(3, produto.getDescricao());
		pstm.setDouble(4, produto.getPrecoUnitario());
		pstm.setInt(5, produto.getQuantidadeEstoque());
		pstm.setInt(6, produto.getCategoria().getId());
		pstm.setString(7, produto.getTipo().name());

		pstm.execute();

		System.out.println("Produto adicionado com sucesso!!!");

	}

	public void atualizar(Produto produto) throws SQLException {

		String sql = "UPDATE comex.PRODUTO SET nome = ?, descricao = ?, preco_unitario = ?, "
				+ "quantidade_estoque = ?, categoria_id = ?, tipo = ?  where id = ?";

		PreparedStatement pstm = conexao.prepareStatement(sql);

		pstm.setString(1, produto.getNome());
		pstm.setString(2, produto.getDescricao());
		pstm.setDouble(3, produto.getPrecoUnitario());
		pstm.setInt(4, produto.getQuantidadeEstoque());
		pstm.setInt(5, produto.getCategoria().getId());
		pstm.setString(6, produto.getTipo().name());
		pstm.setInt(7, produto.getId());

		pstm.execute();

		System.out.println("Produto alterado com sucesso!!!");
		pstm.close();

	}

	public void deletar(Integer id) {
		
		try {
			
		

		String sql = "DELETE FROM comex.PRODUTO where id = ?";
		PreparedStatement pstm = conexao.prepareStatement(sql);

		pstm.setInt(1, id);

		pstm.execute();
		System.out.println("Produto deletado com sucesso!!!");

		pstm.close();
		
		} catch (Exception erro	) {

		System.out.println("Erro ao deletar produto: " + erro);
		}

	}

	public List<Produto> listar() {
		String sql = "SELECT * FROM comex.PRODUTO";

		try {

			PreparedStatement pstm = conexao.prepareStatement(sql);

			List<Produto> produtos = new ArrayList<>();
			ResultSet registros = pstm.executeQuery();
			while (registros.next()) {
				Produto produto = this.populaProduto(registros);

				produtos.add(produto);
			}

			System.out.println(produtos);

			pstm.close();
			registros.close();
			return produtos;
		} catch (Exception erro) {
			System.err.println("Erro ao listar produtos: " + erro);

		}
		return null;

	}

	private Produto populaProduto(ResultSet registros) {
		try {
			Produto produto = new Produto(
					registros.getString("nome"), 
					registros.getString("descricao"),
					registros.getDouble("preco_unitario"),
					registros.getInt("quantidade_estoque"),
					new Categoria(registros.getInt("categoria_id")),
					TipoProduto.valueOf(registros.getString("tipo")));

			produto.setId(registros.getInt("id"));
			;
			return produto;

		} catch (Exception erro) {

			System.err.println("Erro ao popular produto: " + erro);
		}
		return null;

	}

	public Produto buscaPorId(long id) throws SQLException {
		String sql = "SELECT * FROM comex.PRODUTO where id = ?";

		try (PreparedStatement pstm = this.conexao.prepareStatement(sql)) {
			pstm.setLong(1, id);

			try (ResultSet registro = pstm.executeQuery()) {
				Produto produto = null;
				if (registro.next()) {
					produto = this.populaProduto(registro);
				}

				return produto;
			}
		}
	}

}
