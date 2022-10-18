package br.com.comex.ws;

import java.sql.Connection;
import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexWS {
	Connection conexao = new ConnectionFactory().criaConexao();

	private CategoriaDAO categoriaDao = new CategoriaDAO(conexao);

	
	@WebResult(name = "categorias")
	public List<Categoria> getCategorias() {

		List<Categoria> listaCategorias = categoriaDao.listar();

		return listaCategorias;

	}
}
