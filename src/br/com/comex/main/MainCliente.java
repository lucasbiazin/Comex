package br.com.comex.main;

import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ComexExcepetion;

public class MainCliente {

	public static void main(String[] args) throws ComexExcepetion {

		Cliente Ana = new Cliente("Ana Flavia", "111.111.111-11", "(99) 9 9999-9999", "Rua da praia", "77", "Casa",
				"Porto Belo", "Florianopólis", Estados.SC);

		Cliente Eli = new Cliente("Eliezer", "222.222.222-22", "(99) 9 9999-9999", "Rua da Independência", "07", "Casa",
				"Jardim Brasil", "Brasilia", Estados.DF);

		Cliente Gabi = new Cliente("Gabriela", "333.333.333-33", "(99) 9 9999-9999", "Avenida Tricolor", "1930", "Casa",
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
