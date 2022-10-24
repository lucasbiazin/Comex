package br.com.comex.ws;

import java.sql.Connection;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.dao.PedidoDAO;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	Connection conexao = new ConnectionFactory().criaConexao();

	CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
	ClienteDAO clienteDao = new ClienteDAO(conexao);
	ProdutoDAO produtoDao = new ProdutoDAO(conexao);
	PedidoDAO pedidoDao = new PedidoDAO(conexao);
	ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(conexao);

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
	}

	@WebMethod(operationName = "DeletarCategoria")
	@WebResult(name = "categoria")
	public void deletarCategoria(Categoria categoria) {

		categoriaDao.deletar(categoria.getId());

	}

	@WebMethod(operationName = "AtualizarCategoria")
	@WebResult(name = "categoria")
	public void atualizarCategoria(Categoria categoria) {

		try {
			categoriaDao.atualiza(categoria);
		} catch (Exception erro) {
			System.out.println("Erro na operação de atualizar categoria :" + erro);

		}

	}

//		 
//							Operações de clientes

	@WebMethod(operationName = "ListarClientes")
	@WebResult(name = "cliente")
	public List<Cliente> getClientes(Cliente cliente) {

		List<Cliente> clientes = clienteDao.listar();

		return clientes;

	}

	@WebMethod(operationName = "CadastrarClientes")
	@WebResult(name = "cliente")
	public Cliente adicionarCliente(Cliente cliente) {

		clienteDao.salvar(cliente);

		return cliente;
	}

	@WebMethod(operationName = "DeletarCliente")
	@WebResult(name = "cliente")
	public void deletarCliente(Cliente cliente) {

		try {
			clienteDao.deletar(cliente.getId());
		} catch (Exception erro) {
			System.out.println("Erro na operação de deletar cliente :" + erro);
		}

	}

	@WebMethod(operationName = "AtualizarCliente")
	@WebResult(name = "cliente")
	public void atualizarCliente(Cliente cliente) {

		try {

			clienteDao.atualizar(cliente);

		} catch (Exception erro) {
			System.out.println("Erro na operação de atualizar cliente :" + erro);
		}

	}

//	 
//							Operação de produto

	@WebMethod(operationName = "ListarProdutos")
	@WebResult(name = "produto")
	public List<Produto> getProdutos() {

		List<Produto> produtos = produtoDao.listar();

		return produtos;

	}

	@WebMethod(operationName = "CadastrarProduto")
	@WebResult(name = "produto")
	public void cadastrarProduto(Produto produto) {

		try {
			produtoDao.salvar(produto);
		} catch (Exception erro) {
			System.out.println("Erro na operação de cadastrar produto :" + erro);
		}

	}

	@WebMethod(operationName = "DeletarProduto")
	@WebResult(name = "produto")
	public void deletarProduto(Produto produto) {

		produtoDao.deletar(produto.getId());

	}

	@WebMethod(operationName = "AtualizarProduto")
	@WebResult(name = "produto")
	public void atualizarProduto(Produto produto) {

		try {
			produtoDao.atualizar(produto);
		} catch (Exception erro) {
			System.out.println("Erro na operação de atulizar produto :" + erro);
		}

	}

//								Operação de pedido

	@WebMethod(operationName = "ListarPedidos")
	@WebResult(name = "pedido")
	public List<Pedido> getPedidos() {
	

		List<Pedido> pedidos = pedidoDao.listar();

		return pedidos;

	}

	@WebMethod(operationName = "CadastrarPedidos")
	@WebResult(name = "pedido")
	public void cadastrarPedido(Pedido pedido) {

		pedidoDao.insere(pedido);

	}
	@WebMethod(operationName = "DeletarPedido")
	@WebResult(name = "pedido")
	public void deletarPedido(Pedido pedido) {

		pedidoDao.deleta(pedido.getId());

	}
	@WebMethod(operationName = "AtualizarPedido")
	@WebResult(name = "pedido")
	public void atualizarPedido(Pedido pedido) {

		pedidoDao.atualiza(pedido);

	}

//							Operação de Item Pedido
	
	
	
	public List<ItemPedido> getItemPedidos() {

		List<ItemPedido> itemPedidos = itemPedidoDao.lista();

		
		
		return itemPedidos;

	}
	@WebMethod(operationName = "CadastrarItemPedido")
	@WebResult(name = "pedido")
	public void cadastrarItemPedido(ItemPedido item) {

		itemPedidoDao.insere(item);

	}
	@WebMethod(operationName = "DeletarItemPedido")
	@WebResult(name = "pedido")
	public void deletarItemPedido(ItemPedido item) {

		itemPedidoDao.deleta(item.getId());

	}

	@WebMethod(operationName = "AtualizarItemPedido")
	@WebResult(name = "pedido")
	public void atualizarItemPedido (ItemPedido item)  { 
		
		itemPedidoDao.atualiza(item);
		
		
	}
}
