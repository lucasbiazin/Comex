package br.com.comex.ws;

import java.sql.Connection;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexWS {
	Connection conexao = new ConnectionFactory().criaConexao();

	private CategoriaDAO categoriaDao = new CategoriaDAO(conexao);

	@WebMethod(operationName = "getCategorias")
	@WebResult(name = "categoria")
	public List<Categoria> getCategorias() {

		List<Categoria> listaCategorias = categoriaDao.listar();

		return listaCategorias;

	}

	@WebMethod(operationName = "CadastrarCategoria")
	@WebResult(name = "categoria")
	public Categoria adicionarCategoria(Categoria categoria) {

		CategoriaDAO categoriaDAO = new CategoriaDAO(conexao);

		categoriaDAO.salvar(categoria);

		return categoria;

	}

}
