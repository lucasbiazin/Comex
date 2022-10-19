package br.com.comex.ws;

import java.sql.Connection;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexWS {
	Connection conexao = new ConnectionFactory().criaConexao();

	
	
	private CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
	private ClienteDAO clienteDao = new ClienteDAO(conexao);

	@WebMethod(operationName = "listarCategorias")
	@WebResult(name = "categoria")
	public List<Categoria> getCategorias() {

		List<Categoria> categorias = categoriaDao.listar();

		return categorias;

	}

	@WebMethod(operationName = "CadastrarCategoria")
	@WebResult(name = "categoria")
	public Categoria adicionarCategoria(Categoria categoria) {



		categoriaDao.salvar(categoria);

		return categoria;

	}

	@WebResult(name = "cliente")
	public List<Cliente> listarClientes(Cliente cliente) {

		List<Cliente> clientes = clienteDao.listar();

		return clientes;

	}
}
