package br.com.comex.csv;

import java.util.Comparator;

public class PedidoMaisBaratoEMaisCaro implements Comparator<PedidoCsv> {

	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {

		int quantidade1 = Integer.parseInt(p1.getQuantidade());
		int quantidade2 = Integer.parseInt(p2.getQuantidade());

		double preco1 = Double.parseDouble(p1.getPreco());
		double preco2 = Double.parseDouble(p2.getPreco());

		if (quantidade1 * preco1 == quantidade2 * preco2) {

			return 0;
		} else if (quantidade1 * preco1 > quantidade2 * preco2) {

			return 1;
		} else {

			return -1;
		}

	}

}
