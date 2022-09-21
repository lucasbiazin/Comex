

public class MainProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.setId(1);
		produto.setNome("Notebook Samsung");
		produto.setPrecoUnitario(3523.00);
		produto.setQuantidadeEstoque(1);
		produto.setCategoria("INFORMÁTICA");
		double valorComImposto = produto.CalculaImposto(3523);
		double valorEstoque = produto.CalculaTotal(3523, 1);

		System.out.println(produto.id + produto.nome + produto.precoUnitario + produto.quantidadeEstoque
				+ produto.categoria + valorComImposto + valorEstoque);

		Produto produto2 = new Produto();

		produto2.setId(2);
		produto2.setNome("Clean Architecture");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEstoque(2);
		produto2.setCategoria("LIVROS");

		double valorComImposto2 = produto2.CalculaImposto(102.90);
		double valorEstoque2 = produto2.CalculaTotal(102.90, 2);

		System.out.println(produto2.id + produto2.nome + produto2.precoUnitario + produto2.quantidadeEstoque
				+ produto2.categoria + valorComImposto2 + valorEstoque2);

		Produto produto3 = new Produto();

		produto3.setId(3);
		produto3.setNome("Monitor Dell 27");
		produto3.setPrecoUnitario(1889.00);
		produto3.setQuantidadeEstoque(3);
		produto3.setCategoria("INFORMÁTICA");

		double valorComImposto3 = produto3.CalculaImposto(1889);
		double valorEstoque3 = produto3.CalculaTotal(1889, 3);

		System.out.println(produto3.id + produto3.nome + produto3.precoUnitario + produto3.quantidadeEstoque
				+ produto3.categoria + valorComImposto3 + valorEstoque3);

		ProdutoIsento produtoIsento = new ProdutoIsento();

		produtoIsento.setId(2);
		produtoIsento.setNome("Clean Architecture");
		produtoIsento.setPrecoUnitario(102.90);
		produtoIsento.setQuantidadeEstoque(2);
		produtoIsento.setCategoria("LIVROS");

		double valorEstoqueTotal = produtoIsento.calculaTotalIsentos(102.90, 2);

		double valorImpostoIsento = produtoIsento.impostoIsento(0);

		System.out.println(produtoIsento.id + produtoIsento.nome + produtoIsento.precoUnitario
				+ produtoIsento.quantidadeEstoque + produtoIsento.categoria + valorEstoqueTotal + valorImpostoIsento);

		
		
	
		
		
	}
	
	
	
	
	
}
