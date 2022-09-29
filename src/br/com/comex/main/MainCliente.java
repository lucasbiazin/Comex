package br.com.comex.main;

import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {

		Cliente Ana = new Cliente("Ana Flavia", "111.111.111-11", "44 11111-1111", "Rua da praia", "77", "Casa",
				"Porto Belo", "Florianopólis", Estados.SC);

		Cliente Eli = new Cliente("Eliezer", "222.222.222-22", "44 22222-2222", "Rua da Independência", "07", "Casa",
				"Jardim Brasil", "Brasilia", Estados.DF);

		Cliente Gabi = new Cliente("Gabriela", "333.333.333-33", "11 33333-3333", "Avenida Tricolor", "1930", "Casa",
				"Morumbi", "São Paulo", Estados.SP);

		// Imprimir resultados
		System.out.println(
				"-|ID|--|Nome|----------|CPF|-----------|Telefone|--------|Rua|-------------|Número|----|Complemento|-"
						+ "|Bairo|-|Cidade|--" + "------------|Estado------------");

		System.out.println("");
		System.out.println(Ana);

		System.out.println(
				" -----------------------------------------------------------------------------------------------------"
						+ "-----------------------------------------------");
		System.out.println("");

		System.out.println(Eli);

		System.out.println(
				" ------------------------------------------------------------------------------------------------------"
						+ "-----------------------------------------------");

		System.out.println("");
		System.out.println(Gabi);

		System.out.println(
				" ------------------------------------------------------------------------------------------------------"
						+ "-----------------------------------------------");
	}

}
