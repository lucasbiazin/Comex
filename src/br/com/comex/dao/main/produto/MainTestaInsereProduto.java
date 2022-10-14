package br.com.comex.dao.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.enums.TipoProduto;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class MainTestaInsereProduto {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = new ConnectionFactory().criaConexao();
		
		ProdutoDAO produtoDao = new ProdutoDAO(conexao);
		
		produtoDao.salvar(new Produto("Xioami note 11", "128gb", 2500, 5, new Categoria(4), TipoProduto.NAO_ISENTO));
		produtoDao.salvar(new Produto("MacBook 2019", "1tb", 9500, 5, new Categoria(4), TipoProduto.NAO_ISENTO));
		
		
		conexao.close();

	}

}
