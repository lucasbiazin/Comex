package br.com.comex.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeitorPedidosCsv {

	public static void main(String[] args) throws IOException {

		int totalLinhas = 1;

		List listaPedidos = new ArrayList<PedidoCsv>();

		FileInputStream file = new FileInputStream("src/br/com/comex/csv/Pedidos.csv");
		InputStreamReader reader = new InputStreamReader(file);
		BufferedReader buffered = new BufferedReader(reader);

		String linhaBf = buffered.readLine();
		linhaBf = buffered.readLine();

		while (linhaBf != null) {

			String[] vetor = linhaBf.split(",");
			String categoria = vetor[0];
			String produto = vetor[1];
			Double preco = Double.parseDouble(vetor[2]);
			int quantidade = Integer.parseInt(vetor[3]);
			String data = vetor[4];
			String Cliente = vetor[5];

			PedidoCsv pedido = new PedidoCsv(categoria, produto, Cliente, produto, Cliente, data);
			listaPedidos.add(pedido);

			linhaBf = buffered.readLine();
			totalLinhas++;
		}

		System.out.println("Total de pedidos: " + listaPedidos.size());

		reader.close();
	}

}
