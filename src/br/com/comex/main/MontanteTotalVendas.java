package br.com.comex.main;

import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;

public class MontanteTotalVendas {

	public static void main(String[] args) throws Exception    {

		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitorPedidosCsv.lerPedidos();
		leitorPedidosCsv.valorTotalVendidos(pedidos);
		
		
		
	}
}




