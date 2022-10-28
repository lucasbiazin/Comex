package br.com.comex.dao.main.pedido;

import java.sql.Connection;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaRemocaoPedido {

	public static void main(String[] args) {
		
		Connection conexao = new ConnectionFactory().criaConexao();		
		PedidoDAO pedidoDao = new PedidoDAO(conexao);
		
		pedidoDao.deleta(8);

	}

}
