package br.com.comex.command;

import java.sql.Connection;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.enums.TipoProduto;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class InsereProdutoCommand {

	
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private Categoria categoria;
	private TipoProduto tipo;

	private ProdutoDAO produtoDao;

	public InsereProdutoCommand( String nome, String descricao, double precoUnitario, int quantidadeEstoque,
			Categoria categoria, TipoProduto tipo, Connection conexao) {
		super();
		
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
		this.tipo = tipo;

		this.produtoDao = new ProdutoDAO(conexao);
	}

	public void execute() {
		try {
			Produto novoProduto = new Produto(nome, descricao, precoUnitario, quantidadeEstoque, categoria, tipo);
			produtoDao.salvar(novoProduto);

		} catch (Exception erro) {
			System.err.println("Erro ao salvar produto no banco de dados: " + erro);

		}
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

	public TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}

	public ProdutoDAO getProdutoDao() {
		return produtoDao;
	}

	public void setProdutoDao(ProdutoDAO produtoDao) {
		this.produtoDao = produtoDao;
	}
	
	
	
}
