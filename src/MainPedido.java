
public class MainPedido {

	public static void main(String[] args) {
		
		
Pedido pedido1 = new Pedido( "21/09/2022 10h28", new Cliente( "Ana", "111.111.111-11", "(44) 11111-1111", 
		"Rua da praia", 77, "Casa","Porto Belo", "Florianopólis", "Santa Catarina"));
		
		
Pedido pedido2 = new Pedido( "21/09/2022 11h35", new Cliente( "Eli", "222.222.222-22", "(11)1111-1111", 
		"Rua Barbosa Silva", 23, "Casa", "Vila Araújo", "São José", "SP"));

Pedido pedido3 = new Pedido( "21/09/2022 14h40", new Cliente( "Gabi", "333.333.333-33", "(44)33333-3333", 
		"Avenida Tricolor", 1930, "Casa","Morumbi", "São Paulo", "São Paulo"));






System.out.println("Pedido " + pedido1.id + ":");
System.out.println("Data: " + pedido1.data);
System.out.println("Cliente: " + pedido1.cliente.getNome());

System.out.println(" ");
System.out.println("Pedido " + pedido2.id + ":");
System.out.println("Data: " + pedido2.data);
System.out.println("Cliente: " + pedido2.cliente.getNome());

System.out.println(" ");
System.out.println("Pedido " + pedido3.id + ":");
System.out.println("Data: " + pedido3.data);
System.out.println("Cliente: " + pedido3.cliente.getNome());

	}

}
