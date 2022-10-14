package br.com.comex.dao.main.categoria;

import java.sql.Connection;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaInsereCategoria {

	public static void main(String[] args) {

		try {
			Connection conexao = new ConnectionFactory().criaConexao();

			CategoriaDAO categoriaDao = new CategoriaDAO(conexao);

			Categoria categoria = new Categoria("Outros", StatusCategoria.ATIVA);

			categoriaDao.salvar(categoria);

		} catch (Exception erro) {
			System.out.println("Erro ao rodar o main testa categoria :" + erro);
		}
	}

}
