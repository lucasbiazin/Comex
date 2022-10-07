package br.com.comex.main;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.PedidoMaisBaratoEMaisCaro;

public class MainOrdenacoes {

	public static void main(String[] args) throws Exception {
		Locale ptBr = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(ptBr);

		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitorPedidosCsv.lerPedidos();
		List<PedidoCsv> pedidos2 = leitorPedidosCsv.lerPedidos();

		PedidoMaisBaratoEMaisCaro pedidoPorPrecoMaisBaratoOuMaisCaro = new PedidoMaisBaratoEMaisCaro();
		pedidos.sort(pedidoPorPrecoMaisBaratoOuMaisCaro);

		System.out.println("Pedido mais barato: " + dinheiro.format(Double.parseDouble(pedidos.get(0).getPreco())) + " " + pedidos.get(0).getProduto());
		
		System.out.println("Pedido mais caro: " + dinheiro.format(Double.parseDouble(pedidos.get(pedidos.size() - 1).getPreco()) 
		* Double.parseDouble( pedidos.get(pedidos.size() -1).getQuantidade())) + " " + pedidos.get(pedidos.size() -1).getProduto());

	}

}
