package br.com.comex.dao.main.produto;

import java.sql.Connection;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaListagemItemPedido {

	public static void main(String[] args) {

Connection conexao = new ConnectionFactory().criaConexao();
ItemPedidoDAO itemPedido = new ItemPedidoDAO(conexao);

itemPedido.lista();
		
		
	}

}
