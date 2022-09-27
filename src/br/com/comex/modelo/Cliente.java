package br.com.comex.modelo;
import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {

	private static final AtomicInteger count = new AtomicInteger(0); 
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private int numeroPredial;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;

	// Construtor

	public Cliente( String nome, String cpf, String telefone, String rua, int numeroPredial, String complemento,
			String bairro, String cidade, String estado) {

		this.id = count.incrementAndGet();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numeroPredial = numeroPredial;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	// Getters

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getRua() {
		return rua;
	}

	public int getNumeroPredial() {
		return numeroPredial;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

}
