package br.com.comex.main;

import br.com.comex.enums.Estados;
import br.com.comex.enums.StatusCategoria;
import br.com.comex.enums.TipoProduto;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ComexExcepetion;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainItemPedido {

	public static void main(String[] args) throws ComexExcepetion {

		Categoria categoria1 = new Categoria("INFORMÁTICA", StatusCategoria.ATIVA);
		Categoria categoria2 = new Categoria("Doces", StatusCategoria.ATIVA);
		Categoria categoria3 = new Categoria("Eletrônicos", StatusCategoria.ATIVA);

		Pedido pedido1 = new Pedido("21/09/2022 10h28", new Cliente("Ana Flavia", "111.111.111-11", "(99) 9 9999-9999",
				"Rua da praia", "77", "Casa", "Porto Belo", "Florianopólis", Estados.SC));

		Pedido pedido2 = new Pedido("21/09/2022 11h35", new Cliente("Eliezer", "222.222.222-22", "(99) 9 9999-9999",
				"Rua Barbosa Silva", "23", "Casa", "Vila Araújo", "São José", Estados.SP));

		Pedido pedido3 = new Pedido("21/09/2022 14h40", new Cliente("Gabriela", "333.333.333-33", "(99) 9 9999-9999",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		Pedido pedido4 = new Pedido("21/09/2022 14h40", new Cliente("Gabriela", "333.333.333-33", "(99) 9 9999-9999",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		Produto produto1 = new Produto("Mouse Raser Dragon", "Gamer", 230, 14, categoria1, TipoProduto.NAO_ISENTO);
		Produto produto2 = new Produto("Playstation 5  m.física", "Video-Games", 3970.00, 9, categoria3, TipoProduto.NAO_ISENTO);
		Produto produto3 = new Produto("Iphone 13 Pro Max", "Iphone", 8900.00, 4, categoria3, TipoProduto.NAO_ISENTO);
		Produto produto4 = new Produto("Chiclete tatuagem", "Chicletes", 0.20, 114, categoria2, TipoProduto.NAO_ISENTO);

		ItemPedido itempedido1 = new ItemPedido(230.00, 2, produto1, pedido1, 0.10, 1);
		ItemPedido itempedido2 = new ItemPedido(3970.00, 1, produto2, pedido2, 0.10, 1);
		ItemPedido itempedido3 = new ItemPedido(2900.00, 2, produto3, pedido3, 0.05, 1);
		ItemPedido itempedido4 = new ItemPedido(0.20, 22, produto4, pedido4, 0, 0);

		System.out
				.println("|Pedido|---|Produto|-----------|Quantidade|-------|Desconto|------------|Tipo-Desconto|-----"
						+ "---|Valor-Sem-Desconto|-----|Valor-Com-Desconto|---");
		System.out.println("");
		System.out.println(itempedido1);

		System.out.println("------------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------");
		System.out.println(itempedido2);

		System.out.println("------------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------");
		System.out.println("");
		System.out.println(itempedido3);

		System.out.println("------------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------");
		System.out.println(itempedido4);

		System.out.println("------------------------------------------------------------------------------------"
				+ "-----------------------------------------------------------");

	}

}
