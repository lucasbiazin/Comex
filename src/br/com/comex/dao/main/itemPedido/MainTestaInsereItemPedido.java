package br.com.comex.dao.main.itemPedido;

import java.sql.Connection;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.enums.EnumTipoDesconto;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainTestaInsereItemPedido {

	public static void main(String[] args) {

		Connection conexao = new ConnectionFactory().criaConexao();
		ItemPedidoDAO itemPedido = new ItemPedidoDAO(conexao);
		ItemPedido pedido = new ItemPedido();

		itemPedido.insere(new ItemPedido(150 , 11, new Produto(11), new Pedido(1), pedido.filtraDescontos(), EnumTipoDesconto.QUANTIDADE));

	}

}
