package br.com.comex.modelo;

public class ProdutoIsento extends Produto {

	public ProdutoIsento(String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria) {
		super(nome, descricao, precoUnitario, quantidadeEstoque, categoria);
		// TODO Auto-generated constructor stub
	}

	public double calculaTotalIsentos(double preco, double estoque) {

		preco = precoUnitario;
		estoque = quantidadeEstoque;
		double valor;

		valor = preco * estoque;

		return (valor);

	};

	public int impostoIsento() {

		return (0);
	};

	public int getId() {
		return this.id;
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

	@Override
	public double getPrecoUnitario() {
		// TODO Auto-generated method stub
		return super.getPrecoUnitario();
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
