package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.enums.Status;

public class MainCategoria {

	public static void main(String[] args) {
		System.out.println(" ----------------------Categorias-----------------------");
		System.out.println(" ");
		Categoria categoria1 = new Categoria("INFORMATICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("MOVEIS", Status.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", Status.ATIVA);

		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(categoria3);
		System.out.println(" ");
		System.out.println(" -------------------------------------------------------");

	}

}
