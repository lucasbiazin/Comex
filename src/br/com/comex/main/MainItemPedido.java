package br.com.comex.main;

import br.com.comex.enums.Estados;
import br.com.comex.enums.Status;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainItemPedido {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("Doces", Status.ATIVA);
		Categoria categoria3 = new Categoria("Eletrônicos", Status.ATIVA);
		
		
		Pedido pedido1 = new Pedido( "21/09/2022 10h28", new Cliente( "Ana", "111.111.111-11", "(44) 11111-1111",
				"Rua da praia", "77", "Casa", "Porto Belo", "Florianopólis", Estados.SC));

		Pedido pedido2 = new Pedido( "21/09/2022 11h35", new Cliente( "Eli", "222.222.222-22", "(11)1111-1111",
				"Rua Barbosa Silva", "23", "Casa", "Vila Araújo", "São José", Estados.SP));

		Pedido pedido3 = new Pedido( "21/09/2022 14h40", new Cliente( "Gabi", "333.333.333-33", "(44)33333-3333",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		Pedido pedido4 = new Pedido( "21/09/2022 14h40", new Cliente( "Gabi", "333.333.333-33", "(44)33333-3333",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		
		
		Produto produto1 = new Produto("Mouse Raser Dragon", "Gamer", 230, 14,categoria1);
		Produto produto2 = new Produto("Playstation 5", "Video-Games", 3970.00, 9, categoria3);
		Produto produto3 = new Produto("Iphone 11", "Iphone", 2900.00, 4, categoria3);
		Produto produto4 = new Produto("Chiclete tatuagem", "Chicletes", 0.20, 114, categoria2);

		
		ItemPedido itempedido1 = new ItemPedido( 230.00, 2, produto1, pedido1, 0.10, 1);
		ItemPedido itempedido2 = new ItemPedido( 3970.00, 1, produto2, pedido2, 0.10, 1);
		ItemPedido itempedido3 = new ItemPedido( 2900.00, 2, produto3, pedido3, 0.05, 1);
		ItemPedido itempedido4 = new ItemPedido( 0.20, 22, produto4, pedido4, 0, 0);

		System.out.println("Pedido " + itempedido1.getId() + ":");
		System.out.println("Produto: " + produto1.getNome());
		System.out.println("Quantidade : " + itempedido1.getQuantidade());
		System.out.println("Desconto: " + itempedido1.getDesconto());
		System.out.println("Tipo do desconto: " + itempedido1.getTipoDesconto());
		System.out.println("Preço total : R$ " + String.format("%.2f", itempedido1.SemDesconto()));
		System.out.println("Preço promocional: R$ " + String.format("%.2f", itempedido1.filtraDescontos()));
	
		System.out.println("");
		System.out.println("Pedido " + itempedido2.getId() + ":");
		System.out.println("Produto: " + produto2.getNome());
		System.out.println("Quantidade : " + itempedido2.getQuantidade());
		System.out.println("Desconto: " + itempedido2.getDesconto());
		System.out.println("Tipo do desconto: " + itempedido2.getTipoDesconto());
		System.out.println("Preço total : R$ " + String.format("%.2f", itempedido2.SemDesconto()));
		System.out.println("Preço promocional: R$ " + String.format("%.2f", itempedido2.filtraDescontos()));

		System.out.println("");
		System.out.println("Pedido " + itempedido3.getId() + ":");
		System.out.println("Produto: " + produto3.getNome());
		System.out.println("Quantidade : " + itempedido3.getQuantidade());
		System.out.println("Desconto: " + itempedido3.getDesconto());
		System.out.println("Tipo do desconto: " + itempedido3.getTipoDesconto());
		System.out.println("Preço total : R$ " + String.format("%.2f", itempedido3.SemDesconto()));
		System.out.println("Preço  promocional: R$ " + String.format("%.2f", itempedido3.filtraDescontos()));
		
		System.out.println("");
		System.out.println("Pedido " + itempedido4.getId() + ":");
		System.out.println("Produto: " + produto4.getNome());
		System.out.println("Quantidade : " + itempedido4.getQuantidade());
		System.out.println("Desconto: " + itempedido4.getDesconto());
		System.out.println("Tipo do desconto:  " + itempedido4.getTipoDesconto());
		System.out.println("Preço total R$: " + String.format("%.2f", itempedido4.SemDesconto()));
		System.out.println("Preço  promocional R$: " + String.format("%.2f", itempedido4.filtraDescontos()));

	}

}
