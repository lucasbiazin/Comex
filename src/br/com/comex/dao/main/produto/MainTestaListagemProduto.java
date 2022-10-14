package br.com.comex.dao.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaListagemProduto {

	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().criaConexao();

		ProdutoDAO produtoDao = new ProdutoDAO(conexao);
		
		produtoDao.listar();

	}

}
