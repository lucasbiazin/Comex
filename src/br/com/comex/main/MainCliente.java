package br.com.comex.main;
import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {

		Cliente Ana = new Cliente( "Ana Flavia", "111.111.111-11", "(44)11111-1111", "Rua da praia", "77", "Casa",
				"Porto Belo", "Florianopólis", Estados.SC);

		Cliente Eli = new Cliente("Eliezer", "222.222.222-22", "(44)22222-2222", "Rua da Independência","07", "Casa",
				"Jardim Brasil", "Brasilia", Estados.DF);

		Cliente Gabi = new Cliente( "Gabriela", "333.333.333-33", "(11)33333-3333", "Avenida Tricolor", "1930", "Casa",
				"Morumbi", "São Paulo", Estados.SP);

		// Imprimir resultados
		System.out.println("-------------------Clientes------------------");
		System.out.println(" ID: " + Ana.getId());
		System.out.println(" Nome: " + Ana.getNome());
		System.out.println(" CPF: " + Ana.getCpf());
		System.out.println(" Telefone: " + Ana.getTelefone());
		System.out.println(" Rua: " + Ana.getRua());
		System.out.println(" Número do endereço: " + Ana.getNumeroPredial());
		System.out.println(" Complemento: " + Ana.getComplemento());
		System.out.println(" Bairro: " + Ana.getBairro());
		System.out.println(" Cidade: " + Ana.getCidade());
		System.out.println(" Estado: " + Ana.getEstado());
		System.out.println(" ---------------------------------------------");

		System.out.println(" ID: " + Eli.getId());
		System.out.println(" Nome: " + Eli.getNome());
		System.out.println(" CPF: " + Eli.getCpf());
		System.out.println(" Telefone: " + Eli.getTelefone());
		System.out.println(" Rua: " + Eli.getRua());
		System.out.println(" Número do endereço: " + Eli.getNumeroPredial());
		System.out.println(" Complemento: " + Ana.getComplemento());
		System.out.println(" Bairro: " + Eli.getBairro());
		System.out.println(" Cidade: " + Eli.getCidade());
		System.out.println(" Estado: " + Eli.getEstado());
		System.out.println(" ---------------------------------------------");

		System.out.println(" ID: " + Gabi.getId());
		System.out.println(" Nome: " + Gabi.getNome());
		System.out.println(" CPF: " + Gabi.getCpf());
		System.out.println(" Telefone: " + Gabi.getTelefone());
		System.out.println(" Rua: " + Gabi.getRua());
		System.out.println(" Número do endereço: " + Gabi.getNumeroPredial());
		System.out.println(" Complemento: " + Gabi.getComplemento());
		System.out.println(" Bairro: " + Gabi.getBairro());
		System.out.println(" Cidade: " + Gabi.getCidade());
		System.out.println(" Estado: " + Gabi.getEstado());
		System.out.println(" ---------------------------------------------");
	}

}
