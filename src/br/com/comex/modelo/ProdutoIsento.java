package br.com.comex.modelo;

import br.com.comex.enums.TipoProduto;

public class ProdutoIsento extends Produto {

	public ProdutoIsento(String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria, TipoProduto tipo ) {
		super(nome, descricao, precoUnitario, quantidadeEstoque, categoria, tipo);
		// TODO Auto-generated constructor stub
	}

	public double calculaTotalIsentos(double preco, double estoque) {

		preco = getPrecoUnitario();
		estoque = getQuantidadeEstoque();
		double valor;

		valor = preco * estoque;

		return (valor);

	};

	public int impostoIsento() {

		return (0);
	};

	public int getId() {
		return super.getId();
	}

	public void setId(int id) {
		super.setId(id); 
	}

	public String getNome() {
		return super.getNome();
	}

	public void setNome(String nome) {
		setPrecoUnitario(getPrecoUnitario());
	}

	public String getDescricao() {
		return super.getDescricao();
	}

	public void setDescricao(String descricao) {
		super.setDescricao(descricao); 
	}

	@Override
	public double getPrecoUnitario() {
		// TODO Auto-generated method stub
		return super.getPrecoUnitario();
	}

	public void setPrecoUnitario(double precoUnitario) {
		super.setPrecoUnitario(precoUnitario); 
	}

	public int getQuantidadeEstoque() {
		return super.getId();
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		super.setQuantidadeEstoque(quantidadeEstoque); 
	}

	public Categoria getCategoria() {
		return super.getCategoria();
	}

	public void setCategoria(Categoria categoria) {
		super.setCategoria(categoria);
	}

}
