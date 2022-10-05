package br.com.comex.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeitorPedidosCsv {

	
	public List<PedidoCsv> lerPedidos() throws Exception {
		List<PedidoCsv> pedidos= new ArrayList<PedidoCsv>();

		FileInputStream pedidoCsvFile = new FileInputStream("Pedidos.csv");
		InputStreamReader reader = new InputStreamReader(pedidoCsvFile);
		BufferedReader buffered = new BufferedReader(reader);

		String linhaBf = buffered.readLine();
		linhaBf = buffered.readLine();

		while (linhaBf != null) {

			String[] vetor = linhaBf.split(",");
			String categoria = vetor[0];
			String produto = vetor[1];
			String preco = vetor[2];
			String quantidade = vetor[3];
			String data = vetor[4];
			String Cliente = vetor[5];

			PedidoCsv pedido = new PedidoCsv(categoria, produto, Cliente, preco, quantidade, data);
			pedidos.add(pedido);

			linhaBf = buffered.readLine();

		}

		System.out.println("Total de pedidos:  " + pedidos.size());

		reader.close();
		return pedidos;
	}

}
