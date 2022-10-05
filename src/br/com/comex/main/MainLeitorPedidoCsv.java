package br.com.comex.main;

import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;

public class MainLeitorPedidoCsv {

	public static void main(String[] args) throws Exception {

		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidosCsv.lerPedidos();

	}

}
