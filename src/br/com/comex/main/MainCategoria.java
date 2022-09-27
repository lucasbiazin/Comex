package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.enums.Status;
public class MainCategoria {

	public static void main(String[] args) {
		System.out.println(" ----------------------Categorias-----------------------");
		System.out.println(" ");
		Categoria categoria1 = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", Status.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", Status.ATIVA);
		
		System.out.println(categoria1.getId() + " - " + categoria1.getNome() + " Status:" + categoria1.isStatus() + " ");
		System.out.println(categoria2.getId() + " - " + categoria2.getNome() + " Status:" + categoria2.isStatus() + " ");
		System.out.println(categoria3.getId() + " - " + categoria3.getNome() + " Status:" + categoria3.isStatus() + " ");
		System.out.println(" ");
		System.out.println(" -------------------------------------------------------");

	}

}
