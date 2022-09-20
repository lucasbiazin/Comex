
public class MainProduto {

public static void main(String[] args) {
	
	Produto produto = new Produto();
	
	produto.id = 1;
	produto.nome = "Notebook Samsung";
	produto.precoUnitario = 3523.00;
	produto.quantidadeEstoque = 1;
	produto.categoria = "INFORMÁTICA";
	double valorComImposto = produto.CalculaImposto(3523);
	double valorEstoque = produto.CalculaTotal(3523, 1);
	
		System.out.println(produto.id + produto.nome + produto.precoUnitario + 
				produto.quantidadeEstoque + produto.categoria + valorComImposto + valorEstoque);
	
	
	
Produto produto2 = new Produto();
	
	produto2.id = 2;
	produto2.nome = "Clean Architecture";
	produto2.precoUnitario = 102.90;
	produto2.quantidadeEstoque = 2;
	produto2.categoria = "LIVROS";
	
	double valorComImposto2 = produto2.CalculaImposto(102.90);
	double valorEstoque2 = produto2.CalculaTotal(102.90, 2);
	
		System.out.println(produto2.id + produto2.nome + produto2.precoUnitario + 
				produto2.quantidadeEstoque +  produto2.categoria + valorComImposto2 + valorEstoque2);
	
	
Produto produto3 = new Produto();
	
	produto3.id = 3;
	produto3.nome = "Monitor Dell 27";
	produto3.precoUnitario = 1889.00;
	produto3.quantidadeEstoque = 3;
	produto3.categoria = "INFORMÁTICA";
	
	double valorComImposto3 = produto3.CalculaImposto(1889);
	double valorEstoque3 = produto3.CalculaTotal(1889, 3);
	
		System.out.println(produto3.id + produto3.nome + produto3.precoUnitario + 
				produto3.quantidadeEstoque + produto3.categoria + valorComImposto3 + valorEstoque3);
		
	
	
}

}
