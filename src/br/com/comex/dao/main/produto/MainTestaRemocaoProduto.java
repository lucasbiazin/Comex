package br.com.comex.dao.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaRemocaoProduto {
	public static void main(String[] args) throws SQLException, Exception {

		Connection conexao = new ConnectionFactory().criaConexao();

		ProdutoDAO produtoDao = new ProdutoDAO(conexao);
		
		produtoDao.deletar(16);

		
		conexao.close();
	}

}
