package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {
		
		
Pedido pedido1 = new Pedido( "21/09/2022 10h28", new Cliente( "Ana", "111.111.111-11", "(44) 11111-1111", 
		"Rua da praia", 77, "Casa","Porto Belo", "Florianopólis", "Santa Catarina"));
		
		
Pedido pedido2 = new Pedido( "21/09/2022 11h35", new Cliente( "Eli", "222.222.222-22", "(11)1111-1111", 
		"Rua Barbosa Silva", 23, "Casa", "Vila Araújo", "São José", "SP"));

Pedido pedido3 = new Pedido( "21/09/2022 14h40", new Cliente( "Gabi", "333.333.333-33", "(44)33333-3333", 
		"Avenida Tricolor", 1930, "Casa","Morumbi", "São Paulo", "São Paulo"));






System.out.println("Pedido " + pedido1.getId()+ ":");
System.out.println("Data: " + pedido1.getData());
System.out.println("Cliente: " + pedido1.getCliente().getNome());

System.out.println(" ");
System.out.println("Pedido " + pedido2.getId() + ":");
System.out.println("Data: " + pedido2.getData());
System.out.println("Cliente: " + pedido2.getCliente().getNome());

System.out.println(" ");
System.out.println("Pedido " + pedido3.getId() + ":");
System.out.println("Data: " + pedido3.getData());
System.out.println("Cliente: " + pedido3.getCliente().getNome());

	}

}
