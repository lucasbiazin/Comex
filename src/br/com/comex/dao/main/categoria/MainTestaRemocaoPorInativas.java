package br.com.comex.dao.main.categoria;

import java.sql.Connection;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaRemocaoPorInativas {
	
	public static void main(String[] args) {

		Connection conexao = new ConnectionFactory().criaConexao();

		CategoriaDAO categoriaDao = new CategoriaDAO(conexao);

		categoriaDao.deletaInativas();

	}

}
