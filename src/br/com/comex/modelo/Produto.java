package br.com.comex.modelo;

import java.util.concurrent.atomic.AtomicInteger;

public class Produto {

	private static final AtomicInteger count = new AtomicInteger(0);
	int id;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	Categoria categoria;

	public Produto(String nome, String descricao, double precoUnitario, int quantidadeEstoque, Categoria categoria) {

		this.id = count.incrementAndGet();

		verificaNome(nome);
		validaNomeProduto(nome);
		this.nome = nome;

		this.descricao = descricao;

		validaPrecoUnitario(precoUnitario);
		this.precoUnitario = precoUnitario;

		this.quantidadeEstoque = quantidadeEstoque;

		this.categoria = categoria;
	}
	
	
	
	public void verificaNome(String nome) throws ComexExcepetion {
		if (nome.matches("[0-9].*")) 
			throw new ComexExcepetion("O nome deve conter apenas letras!");
	}
	

	public void validaCategoria(Categoria categoria) {

		if (categoria == null) {
			throw new IllegalArgumentException("A categoria deve ser preenchida");
		}
	}

	public double CalculaTotal(double preco, double estoque) {

		preco = precoUnitario;
		estoque = quantidadeEstoque;
		double valor;

		valor = preco * estoque;

		return valor;

	}

	public void validaPrecoUnitario(double produto) {
		if (precoUnitario < 0) {
			throw new IllegalArgumentException("O valor deve ser maior que 0");
		}

	}

	public void validaNomeProduto(String nome) {

		if (nome.length() < 5) {
			throw new IllegalArgumentException("O nome deve conter 5 ou mais caracteres");
		}
	}

	public void validaIDProduto(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("ID inválido.");
		}

	}

	public double CalculaImposto(double valor) {

		valor = precoUnitario * 0.4;

		return (valor);
	};

	public double CalculaTotal(double precoUnitario, int quantidadeEstoque) {

		double valor = precoUnitario * quantidadeEstoque;

		return (valor);
	}

	/** Getters and Setters/ **/

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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public static AtomicInteger getCount() {
		return count;
	};

	@Override
	public String toString() {

		return "ID " + this.id + " - " + "| Nome: " + this.nome + " " + "| Descrição : " + this.descricao + " "
				+ "| Preço: " + this.precoUnitario + " " + "| Quantidade :" + this.quantidadeEstoque + " "
				+ "| Categoria :" + this.categoria.getNome() + "     "
				+ String.format("%.2f", this.CalculaImposto(precoUnitario)) + "          "
				+ String.format("%.2f", this.CalculaTotal(precoUnitario, quantidadeEstoque));

	}

}
