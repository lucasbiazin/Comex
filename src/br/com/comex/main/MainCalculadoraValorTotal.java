package br.com.comex.main;

import br.com.comex.modelo.CalculadoraValorTotal;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Cliente;
import br.com.comex.enums.Estados;
import br.com.comex.enums.Status;

public class MainCalculadoraValorTotal {

	public static void main(String[] args) {

		Categoria categoria1 = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("Doces", Status.ATIVA);
		Categoria categoria3 = new Categoria("Eletrônicos", Status.ATIVA);

		Pedido pedido1 = new Pedido("21/09/2022 10h28", new Cliente("Ana Flavia", "111.111.111-11", "(44) 11111-1111",
				"Rua da praia", "77", "Casa", "Porto Belo", "Florianopólis", Estados.SC));

		Pedido pedido2 = new Pedido("21/09/2022 11h35", new Cliente("Eliezer", "222.222.222-22", "(11)1111-1111",
				"Rua Barbosa Silva", "23", "Casa", "Vila Araújo", "São José", Estados.SP));

		Pedido pedido3 = new Pedido("21/09/2022 14h40", new Cliente("Gabriela", "333.333.333-33", "(44)33333-3333",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		Pedido pedido4 = new Pedido("21/09/2022 14h40", new Cliente("Gabriela", "333.333.333-33", "(44)33333-3333",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		Produto produto1 = new Produto("Notebook Samsung", "Gamer", 3523.00, 14, categoria1);
		Produto produto2 = new Produto("Playstation 5", "Video-Games", 3970.00, 9, categoria3);
		Produto produto3 = new Produto("Iphone 11", "Iphone", 2900.00, 4, categoria3);
		Produto produto4 = new Produto("Chiclete tatuagem", "Chicletes", 0.20, 114, categoria2);

		ItemPedido itempedido1 = new ItemPedido(230.00, 2, produto1, pedido1, 0.10, 1);
		ItemPedido itempedido2 = new ItemPedido(3970.00, 1, produto2, pedido2, 0.10, 1);
		ItemPedido itempedido3 = new ItemPedido(2900.00, 2, produto3, pedido3, 0.05, 1);
		ItemPedido itempedido4 = new ItemPedido(0.20, 22, produto4, pedido4, 0, 0);

		CalculadoraValorTotal calculo = new CalculadoraValorTotal(3, 0, produto2, pedido2, 0, 0, 0);

		System.out.println("-----------------Pedidos--------------------");
		System.out.println("");
		System.out.println("Número do pedido " + itempedido1.getId() + ":");
		System.out.println("Valor total R$: " + String.format("%.2f", calculo.calcula(2, 230)));

		System.out.println("");
		System.out.println("Número do pedido " + itempedido2.getId() + ":");
		System.out.println("Valor total R$: " + String.format("%.2f", calculo.calcula(1, 3970)));

		System.out.println("");
		System.out.println("Número do pedido " + itempedido3.getId() + ":");
		System.out.println("Valor total R$: " + String.format("%.2f", calculo.calcula(2, 2900)));

		System.out.println("");
		System.out.println("Número do pedido " + itempedido4.getId() + ":");
		System.out.println("Valor total R$:  " + String.format("%.2f", calculo.calcula(22, 0.20)));
		System.out.println("--------------------------------------------");
	}

}
