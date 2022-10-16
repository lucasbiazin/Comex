package br.com.comex.dao.main.pedido;

import java.sql.Connection;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainTestaInserePedido {

	public static void main(String[] args) {

		Connection conexao = new ConnectionFactory().criaConexao();
		PedidoDAO pedido = new PedidoDAO(conexao);

		Cliente cliente = new Cliente(10);

		pedido.insere(new Pedido("20/10/2022", cliente));

	}

}
