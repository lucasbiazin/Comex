package br.com.comex.ws;

import java.sql.Connection;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	Connection conexao = new ConnectionFactory().criaConexao();

	 CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
	 ClienteDAO clienteDao = new ClienteDAO(conexao);
	 ProdutoDAO produtoDao = new ProdutoDAO(conexao);

	 
	 
	 
//	 
//	 						Operações de categoria
	 
	 
	@WebMethod(operationName = "listarCategorias")
	@WebResult(name = "categoria")
	public List<Categoria> getCategorias() {

		List<Categoria> categorias = categoriaDao.listar();

		return categorias;

	}

	@WebMethod(operationName = "CadastrarCategoria")
	@WebResult(name = "categoria")
	public Categoria adicionarCategoria(@WebParam(name = "categoria") Categoria categoria) {

		categoriaDao.salvar(categoria);

		return categoria;

		
		
		
//		 
//							Operações de clientes
	}
	@WebMethod(operationName = "ListarClientes")
	@WebResult(name = "cliente")
	public List<Cliente> getClientes(Cliente cliente) {

		List<Cliente> clientes = clienteDao.listar();

		return clientes;

	}
	@WebMethod(operationName = "CadastrarClientes")
	@WebResult(name = "cliente")
	public Cliente adicionarCliente (Cliente cliente) {
		
		clienteDao.salvar(cliente);
		
		return cliente;
	}
	
	
//	 
//							Operação de produto
	
	@WebMethod(operationName = "listarProdutos")
	@WebResult(name = "produto")
	public List<Produto> getProdutos() {

		List<Produto> produtos = produtoDao.listar();

		return produtos;

	}
	
	
	
}
