package br.com.comex.dao.main.itemPedido;

import java.sql.Connection;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainTestaInsereItemPedido {

	public static void main(String[] args) {

		Connection conexao = new ConnectionFactory().criaConexao();
		ItemPedidoDAO itemPedido = new ItemPedidoDAO(conexao);

		itemPedido.insere(new ItemPedido(7500 , 1, new Produto(15), new Pedido(1), 0, "NENHUM"));

	}

}
