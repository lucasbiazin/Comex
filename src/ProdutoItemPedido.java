
public class ProdutoItemPedido {
	int id = 0;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidade;
	String categoriaProduto;

	public ProdutoItemPedido(int id, String nome, double precoUnitario, int quantidade, String categoriaProduto) {
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.categoriaProduto = categoriaProduto;
		id++;
		}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public double getPrecoUni() {
		return this.precoUnitario;
	}

	public int getQuantidadeEst() {
		return this.quantidade;
	}

	public String getCategoriaProduto() {
		return this.categoriaProduto;
	}

	public double calculaPreco() {
		return this.quantidade * this.precoUnitario;
	}

	public double calculaImposto() {
		return this.precoUnitario * 0.4;
	}

}
