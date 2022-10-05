package br.com.comex.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidosCsv {

	public List<PedidoCsv> lerPedidos() throws Exception {
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

		System.out.println("Total de pedidos: " + pedidos.size());

		reader.close();
		return pedidos;
	}

	public List<PedidoCsv> CalculaTotalPedidos() throws FileNotFoundException {

		List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
		InputStreamReader file = new InputStreamReader(new FileInputStream("Pedidos.csv"));
		Scanner sc = new Scanner(file);
		int total = 0;

		sc.nextLine();

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] vetorCalculaTotalProdutos = line.split(",");
			int quantidade = Integer.parseInt(vetorCalculaTotalProdutos[3]);

			total = total + quantidade;

		}
		System.out.println("Total de produtos vendidos: " + total);

		sc.close();
		return pedidos;

	}

	public String CalculaTotalCategorias() throws FileNotFoundException {

		List<String> categorias = new ArrayList<>();

		InputStreamReader file = new InputStreamReader(new FileInputStream("Pedidos.csv"));

		Scanner sc = new Scanner(file);

		sc.nextLine();

		while (sc.hasNextLine()) {

			String line = sc.nextLine();
			String[] vetorCategorias = line.split(",");
			String categoria = vetorCategorias[0];

			if (!categorias.contains(categoria)) {

				categorias.add(categoria);
			}

		}

		System.out.println("Total de categorias: " + categorias.size());

		sc.close();
		return "teste";
	}
}
