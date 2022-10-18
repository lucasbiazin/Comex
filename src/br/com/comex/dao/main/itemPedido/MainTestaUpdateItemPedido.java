package br.com.comex.dao.main.itemPedido;

import java.sql.Connection;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;


public class MainTestaUpdateItemPedido {

	public static void main(String[] args) {

		Connection conexao = new ConnectionFactory().criaConexao();
		
		ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(conexao);
		ItemPedido itemPedido = itemPedidoDao.buscaPorId(1);
		
		System.out.println(itemPedido);
	
		
		itemPedidoDao.atualiza(itemPedido);
		
	}

}
