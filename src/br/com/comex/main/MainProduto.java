package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexExcepetion;
import br.com.comex.enums.StatusCategoria;
import br.com.comex.enums.TipoProduto;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;

public class MainProduto {

	public static void main(String[] args) throws ComexExcepetion {

		Categoria categoria1 = new Categoria("INFORMÁTICA", StatusCategoria.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", StatusCategoria.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", StatusCategoria.ATIVA);

		System.out.println(
				"-ID-|----Nome--------|----Descrição-------|---------Preço--------|----Quantidade----|----Categoria-------------"
						+ "Total-Imposto----------Valor-Total-Estoque--");

		System.out.println("");
		Produto produto = new Produto("Notebook Samsung", "Gamer", 3523.00, 14, categoria1, TipoProduto.NAO_ISENTO);

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------"
						+ "-------------------------------------------");
		System.out.println(produto);

		Produto produto2 = new Produto("Clean Architecture", "Arquitetura de software", 102.90, 12, categoria3, TipoProduto.NAO_ISENTO);

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------"
						+ "-------------------------------------------");
		System.out.println(produto2);

		Produto produto3 = new Produto("Mesa de computador gamer", "Móveis", 1523.00, 9, categoria2, TipoProduto.NAO_ISENTO);

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------"
						+ "-------------------------------------------");
		System.out.println(produto3);

		ProdutoIsento produtoIsento = new ProdutoIsento("Clean Architecture", "Arquitetura de Software", 102.90, 12,
				categoria3, TipoProduto.NAO_ISENTO);
		produtoIsento.setId(2);

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------"
						+ "---------------------------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println(
				"-----------------------------------------------------------------------Produtos isentos de impostos------------------------------------------"
						+ "-----------------");
		System.out.println("");
		System.out.println(produtoIsento);
		System.out.println("");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------"
						+ "-----------------------------------------");

	}

}
