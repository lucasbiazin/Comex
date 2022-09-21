
public class ProdutoIsento {
	int id;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	String  categoria;

	public double calculaTotalIsentos(double preco, double estoque) {

		preco = precoUnitario;
		estoque = quantidadeEstoque;
		double valor;

		valor = preco * estoque;

		return (valor);

	};

	public double impostoIsento(double valor) {

		valor = 0;

		return (valor);
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
