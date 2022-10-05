package br.com.comex.main;

import java.io.FileNotFoundException;

import br.com.comex.csv.LeitorPedidosCsv;

public class TotalCategorias {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		String pedidosCsv = leitorPedidosCsv.CalculaTotalCategorias();

	}

}
