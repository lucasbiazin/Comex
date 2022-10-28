package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexExcepetion;
import br.com.comex.enums.StatusCategoria;

public class MainCategoria {

	public static void main(String[] args )throws ComexExcepetion {
		System.out.println(" ----------------------Categorias-----------------------");
		System.out.println(" ");
		Categoria categoria1 = new Categoria("INFORMATICA", StatusCategoria.ATIVA);
		Categoria categoria2 = new Categoria("MOVEIS", StatusCategoria.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", StatusCategoria.ATIVA);

		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(categoria3);
		System.out.println(" ");
		System.out.println(" -------------------------------------------------------");

	}

}
