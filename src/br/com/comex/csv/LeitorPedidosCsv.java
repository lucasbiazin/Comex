package br.com.comex.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LeitorPedidosCsv {
	Locale localeBR = new Locale("pt", "BR");
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

	public static List<PedidoCsv> lerPedidos() throws Exception {
		List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();

		InputStreamReader reader = new InputStreamReader(new FileInputStream("Pedidos.csv"));
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

		reader.close();
		return pedidos;
	}

	public void totalCategorias(List<PedidoCsv> pedidos) throws FileNotFoundException {

		List<String> categoriasRecebidas = new ArrayList<>();

		for (PedidoCsv pedidosCsv : pedidos) {
			String categoria = pedidosCsv.getCategoria();
			if (!categoriasRecebidas.contains(categoria)) {
				categoriasRecebidas.add(categoria);
			}
		}

		System.out.println(categoriasRecebidas.size());

	}

	public void quantidadePedidos() throws Exception {

		List<PedidoCsv> pedidos = lerPedidos();

		System.out.println("Total de pedidos: " + pedidos.size());

		{

		}

	}

	public void totalProdutosVendidos(List<PedidoCsv> item) {

		int total = 0;

		for (PedidoCsv pedidosCsv : item) {
			String quantidade = pedidosCsv.getQuantidade();

			total = total + Integer.parseInt(pedidosCsv.getQuantidade());

		}
		System.out.println(total);

	}

	public void valorTotalVendidos(List<PedidoCsv> item) {

		double total = 0;

		for (PedidoCsv pedidosCsv : item) {
			double quantidade = Double.parseDouble(pedidosCsv.getQuantidade());
			double preco = Double.parseDouble(pedidosCsv.getPreco());

			total = total + quantidade * preco;
		}
		System.out.println(dinheiro.format(total));

	}
}
