
public class MainProduto {

	public static void main(String[] args) {
		
		
		
		
		Categoria categoria1 = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", Status.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", Status.ATIVA);
		
		
		
		
		System.out.println("------------------------Produtos-----------------------");

		Produto produto = new Produto("Notebook Samsung", "Gamer", 3523.00, 14, categoria1);
		double valorComImposto = produto.CalculaImposto(3523);
		double valorEstoque = produto.CalculaTotal(produto.getPrecoUnitario(), produto.getQuantidadeEstoque());

		
		
		System.out.println("");
		System.out.println("Produto ID: " + produto.id);
		System.out.println("Produto: " + produto.nome);
		System.out.println("Preço R$: " + String.format("%.2f", produto.precoUnitario));
		System.out.println("Quantidade no estoque: " + produto.quantidadeEstoque);
		System.out.println("Categoria: " + produto.categoria.nome);
		System.out.println("Valor dos impostos: R$ " + String.format("%.2f", valorComImposto));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque));

		Produto produto2 = new Produto("Clean Architecture", "Arquitetura de software", 102.90, 12, categoria3);
		double valorComImposto2 = produto2.CalculaImposto(102.90);
		double valorEstoque2 = produto2.CalculaTotal(produto2.getPrecoUnitario(), produto2.getQuantidadeEstoque());

		System.out.println("");
		System.out.println("Produto ID: " + produto2.id);
		System.out.println("Produto: " + produto2.nome);
		System.out.println("Preço R$ : " + String.format("%.2f", produto2.precoUnitario));
		System.out.println("Quantidade no estoque: " + produto2.quantidadeEstoque);
		System.out.println("Categoria: " + produto2.categoria.nome);
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorComImposto2));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoque2));

		Produto produto3 = new Produto("Monitor Dell 27", "Hardware", 1889.00, 32, categoria1);
		double valorComImposto3 = produto3.CalculaImposto(produto3.getPrecoUnitario());
		double valorEstoque3 = produto3.CalculaTotal(produto3.getPrecoUnitario(), produto3.getQuantidadeEstoque());

		System.out.println("");
		System.out.println("Produto ID: " + produto3.id);
		System.out.println("Produto: " + produto3.nome);
		System.out.println("Preço R$ : " + String.format("%.2f", produto3.precoUnitario));
		System.out.println("Quantidade no estoque: " + produto3.quantidadeEstoque);
		System.out.println("Categoria: " + produto3.categoria.nome);
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
		System.out.println("Produto ID: " + produtoIsento.id);
		System.out.println("Produto: " + produtoIsento.nome);
		System.out.println("Preço R$ : " + String.format("%.2f", produtoIsento.precoUnitario));
		System.out.println("Quantidade no estoque: " + produtoIsento.quantidadeEstoque);
		System.out.println("Categoria: " + produtoIsento.categoria.nome);
		System.out.println("Valor total dos impostos : R$ " + String.format("%.2f", valorImpostoIsento));
		System.out.println("Valor total do estoque: R$ " + String.format("%.2f", valorEstoqueTotal));

	}

}
