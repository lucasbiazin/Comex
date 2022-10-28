package br.com.comex.dao.main.categoria;

import java.sql.Connection;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaUpdateCategoria {

	public static void main(String[] args) {
		try {
			Connection conexao = new ConnectionFactory().criaConexao();

			CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
			Categoria categoria = categoriaDao.buscaPorId(3);
			
			categoria.setNome("Livros");
			
			categoriaDao.atualiza(categoria);
			

		} catch (Exception e) {
			System.out.println("Erro :                         "
					+ "" + e + System.lineSeparator());
			e.printStackTrace();
		}
	}
}
