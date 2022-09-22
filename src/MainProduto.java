

public class MainProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.getId();
		produto.setNome("Notebook Samsung");
		produto.setPrecoUnitario(3523.00);
		produto.setQuantidadeEstoque(14);
		produto.setCategoria("INFORMÁTICA");
		double valorComImposto = produto.CalculaImposto(3523);
		double valorEstoque = produto.CalculaTotal(3523, 1);

		
		
		
		System.out.println("");
		System.out.println("Produto ID: " + produto.id);
		System.out.println("Produto: " + produto.nome);
		System.out.println("Preço R$: " + String.format("%.2f", produto.precoUnitario));
		System.out.println("Quantidade no estoque: " + produto.quantidadeEstoque);
		System.out.println("Categoria: " + produto.categoria);
		System.out.println("Valor dos impostos: R$ " + String.format("%.2f", valorComImposto));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque));
		
		

		Produto produto2 = new Produto();

		produto2.getId();
		produto2.setNome("Clean Architecture");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEstoque(12);
		produto2.setCategoria("LIVROS");

		double valorComImposto2 = produto2.CalculaImposto(102.90);
		double valorEstoque2 = produto2.CalculaTotal(102.90, 2);

		System.out.println("");
		System.out.println("Produto ID: " + produto2.id);
		System.out.println("Produto: " + produto2.nome);
		System.out.println("Preço R$ : " +String.format("%.2f", produto2.precoUnitario));
		System.out.println("Quantidade no estoque: " + produto2.quantidadeEstoque);
		System.out.println("Categoria: " + produto2.categoria);
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorComImposto2));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque2));

		Produto produto3 = new Produto();

		produto3.getId();
		produto3.setNome("Monitor Dell 27");
		produto3.setPrecoUnitario(1889.00);
		produto3.setQuantidadeEstoque(32);
		produto3.setCategoria("INFORMÁTICA");

		double valorComImposto3 = produto3.CalculaImposto(1889);
		double valorEstoque3 = produto3.CalculaTotal(1889, 3);

		System.out.println("");
		System.out.println("Produto ID: " + produto3.id);
		System.out.println("Produto: " + produto3.nome);
		System.out.println("Preço R$ : " + String.format("%.2f", produto3.precoUnitario));
		System.out.println("Quantidade no estoque: " + produto3.quantidadeEstoque);
		System.out.println("Categoria: " + produto3.categoria);
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorComImposto3));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque3));

		ProdutoIsento produtoIsento = new ProdutoIsento();

		produtoIsento.setId(2);
		produtoIsento.setNome("Clean Architecture");
		produtoIsento.setPrecoUnitario(102.90);
		produtoIsento.setQuantidadeEstoque(2);
		produtoIsento.setCategoria("LIVROS");

		double valorEstoqueTotal = produtoIsento.calculaTotalIsentos(102.90, 2);

		double valorImpostoIsento = produtoIsento.impostoIsento(0);

		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		System.out.println("Produtos isentos de impostos");
		System.out.println("");
		System.out.println("Produto ID: " + produtoIsento.id);
		System.out.println("Produto: " + produtoIsento.nome);
		System.out.println("Preço R$ : " + String.format("%.2f", produtoIsento.precoUnitario));
		System.out.println("Quantidade no estoque: " + produtoIsento.quantidadeEstoque);
		System.out.println("Categoria: " + produtoIsento.categoria);
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorImpostoIsento));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoqueTotal));
	
		
		
	}
	
	
	
	
	
}
