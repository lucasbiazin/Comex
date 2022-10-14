package br.com.comex.modelo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.comex.enums.TipoProduto;

public class Produto {

	private static final AtomicInteger count = new AtomicInteger(0);
	private  int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private Categoria categoria;
	private TipoProduto tipo;
	
	Locale localeBR = new Locale("pt", "BR");
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

	

	public Produto(String nome, String descricao, double precoUnitario, int quantidadeEstoque, Categoria categoria,
			TipoProduto tipo) {

		this.id = count.incrementAndGet();

		verificaNome(nome);
		validaNomeProduto(nome);
		this.nome = nome;

		this.descricao = descricao;

		validaPrecoUnitario(precoUnitario);
		this.precoUnitario = precoUnitario;

		this.quantidadeEstoque = quantidadeEstoque;

		this.categoria = categoria;
		
		this.tipo = tipo;
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

	public static AtomicInteger getCount() {
		return count;
	};

	@Override
	public String toString() {

		return "ID " + getId() 
				+ "| Nome: " + getNome() + " " 
				+ "| Descrição: " + getDescricao() + " "
				+ "| Preço: " + dinheiro.format(getPrecoUnitario()) + " "
				+ "| Quantidade: " + getQuantidadeEstoque() + " "
				+ "| Categoria: " + getCategoria().getId() + " "
				+System.lineSeparator();}

	

	public TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getCategoriaID(int id ) {
		
		return categoria.getId();
	}
	
	

}
