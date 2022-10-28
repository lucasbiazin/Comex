package br.com.comex.dao.main.pedido;

import java.sql.Connection;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainTestaUpdatePedido {

	public static void main(String[] args) {

		Connection conexao = new ConnectionFactory().criaConexao();

		PedidoDAO pedidoDao = new PedidoDAO(conexao);

		Pedido pedido = pedidoDao.buscaPorId(2);

		pedido.setData("25/01/2022");
		
		pedidoDao.atualiza(pedido);

	}
}