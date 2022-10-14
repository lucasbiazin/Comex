package br.com.comex.dao.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class MainTestaUpdateProduto {
	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().criaConexao();

		ProdutoDAO produtoDao = new ProdutoDAO(conexao);
		Produto produto = produtoDao.buscaPorId(18);

		produto.setNome("Xioami note 12");

		produtoDao.atualizar(produto);

	}
}
