
public class ProdutoIsento {
	int id;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	String categoria;

	
	
	
	public double calculaTotalIsentos(double preco, double estoque) {

		preco = precoUnitario;
		estoque = quantidadeEstoque;
		double  valor;
		
		valor = preco * estoque ;

		return  (valor);

	};
	
	public double impostoIsento(double valor) {

		valor =  0;

		return (valor);
	};
	
	

}
