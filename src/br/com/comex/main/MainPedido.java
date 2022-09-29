package br.com.comex.main;

import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ComexExcepetion;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) throws ComexExcepetion {

		Pedido pedido1 = new Pedido("21/09/2022 10h28", new Cliente("Ana Flavia", "111.111.111-11", "(44) 11111-1111",
				"Rua da praia", "77", "Casa", "Porto Belo", "Florianopólis", Estados.SC));

		Pedido pedido2 = new Pedido("21/09/2022 11h35", new Cliente("Eliezer", "222.222.222-22", "(11)1111-1111",
				"Rua Barbosa Silva", "23", "Casa", "Vila Araújo", "São José", Estados.SP));

		Pedido pedido3 = new Pedido("21/09/2022 14h40", new Cliente("Gabriela", "333.333.333-33", "(44)33333-3333",
				"Avenida Tricolor", "1930", "Casa", "Morumbi", "São Paulo", Estados.SP));

		System.out.println("ID------------Data/Hora-------------------Cliente---------------------|");
		System.out.println("");
		System.out.println("");
		System.out.println(pedido1);

		System.out.println("----------------------------------------------------------------------| ");
		System.out.println(" ");
		System.out.println(pedido2);

		System.out.println("----------------------------------------------------------------------| ");
		System.out.println(" ");
		System.out.println(pedido3);
		System.out.println("----------------------------------------------------------------------| ");

	}

}
