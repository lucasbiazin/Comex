package br.com.comex.dao.main.itemPedido;

import java.sql.Connection;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaListagemItemPedido {

	public static void main(String[] args) {

		try {
			Connection conexao = new ConnectionFactory().criaConexao();
			
			ItemPedidoDAO itemPedidoDao = new ItemPedidoDAO(conexao);
			
			itemPedidoDao.lista();	
	
			conexao.close();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			
		
		
	}

}
