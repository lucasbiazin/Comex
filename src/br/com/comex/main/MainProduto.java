package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.enums.Status;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;


public class MainProduto {

	public static void main(String[] args) {
			
		
		Categoria categoria1 = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", Status.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", Status.ATIVA);
		
			
		
		System.out.println("------------------------Produtos----------------------------");

		
		
		
		Produto produto = new Produto("Notebook Samsung", "Gamer", 3523.00, 14, categoria1);
		double valorComImposto = produto.CalculaImposto(produto.getPrecoUnitario());
		double valorEstoque = produto.CalculaTotal(produto.getPrecoUnitario(), produto.getQuantidadeEstoque());

		
		
		System.out.println("");
		System.out.println("Produto ID: " + produto.getId());
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço R$: " + String.format("%.2f", produto.getPrecoUnitario()));
		System.out.println("Quantidade no estoque: " + produto.getQuantidadeEstoque());
		System.out.println("Categoria: " + produto.getCategoria().getNome());
		System.out.println("Valor dos impostos: R$ " + String.format("%.2f", valorComImposto));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque));

		Produto produto2 = new Produto ("Clean Architecture", "Arquitetura de software", 102.90, 12, categoria3);
		double valorComImposto2 = produto2.CalculaImposto(produto2.getPrecoUnitario());
		double valorEstoque2 = produto2.CalculaTotal(produto2.getPrecoUnitario(), produto2.getQuantidadeEstoque());

		System.out.println("");
		System.out.println("Produto ID: " + produto2.getId());
		System.out.println("Produto: " + produto2.getNome());
		System.out.println("Preço R$ : " + String.format("%.2f", produto2.getPrecoUnitario()));
		System.out.println("Quantidade no estoque: " + produto2.getQuantidadeEstoque());
		System.out.println("Categoria: " + produto2.getCategoria().getNome());
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorComImposto2));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque2));

		Produto produto3 = new Produto ("Mesa de computador gamer", "Móveis", 1523.00, 9, categoria2);
		double valorComImposto3 = produto3.CalculaImposto(produto3.getPrecoUnitario());
		double valorEstoque3 = produto3.CalculaTotal(produto3.getPrecoUnitario(), produto3.getQuantidadeEstoque());

		System.out.println("");
		System.out.println("Produto ID: " + produto3.getId());
		System.out.println("Produto: " + produto3.getNome());
		System.out.println("Preço R$ : " + String.format("%.2f", produto3.getPrecoUnitario()));
		System.out.println("Quantidade no estoque: " + produto3.getQuantidadeEstoque());
		System.out.println("Categoria: " + produto3.getCategoria().getNome());
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorComImposto3));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque3));

		
	
		
		ProdutoIsento produtoIsento = new ProdutoIsento("Clean Architecture", "Arquitetura de Software",102.90, 2, categoria3);
		produtoIsento.setId(2);
		double valorEstoqueTotal = produtoIsento.calculaTotalIsentos(102.90, 2);
		double valorImpostoIsento = produtoIsento.impostoIsento(0);
	

		System.out.println("");
		System.out.println("-------------------Produtos isentos de impostos------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Produto ID: " + produtoIsento.getId());
		System.out.println("Produto: " + produtoIsento.getNome());
		System.out.println("Preço R$ : " + String.format("%.2f", produtoIsento.getPrecoUnitario()));
		System.out.println("Quantidade no estoque: " + produtoIsento.getQuantidadeEstoque());
		System.out.println("Categoria: " + produtoIsento.getCategoria().getNome());
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorImpostoIsento));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoqueTotal));

	}

}
