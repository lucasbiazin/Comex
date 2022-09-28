package br.com.comex.modelo;

import java.util.concurrent.atomic.AtomicInteger;

import br.com.comex.enums.Estados;

public class Cliente {

	private static final AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numeroPredial;
	private String complemento;
	private String bairro;
	private String cidade;
	private Estados estado;

	// Construtor

	public Cliente(String nome, String cpf, String telefone, String rua, String numeroPredial, String complemento,
			String bairro, String cidade, Estados estado) {
		validaIDCliente(id);
		this.id = count.incrementAndGet();

		validaNomeCliente(nome);
		this.nome = nome;

		validaCPF(cpf);
		this.cpf = cpf;

		validaTelefone(telefone);
		this.telefone = telefone;

		validaRua(rua);
		this.rua = rua;

		validaNumeroPredial(numeroPredial);
		this.numeroPredial = numeroPredial;

		this.complemento = complemento;

		validaBairro(bairro);
		this.bairro = bairro;

		validaCidade(cidade);
		this.cidade = cidade;

		validaEstado(estado);
		this.estado = estado;
	}

	public void validaTelefone(String telefone) {

		if (telefone.length() < 11 | telefone.length() > 16)
			throw new IllegalArgumentException("telefone deve conter de 11 a 16 caracteres");

	}

	public void validaCPF(String cpf) {

		if (cpf.length() < 11 | cpf.length() > 14 | cpf == null)
			throw new IllegalArgumentException("CPF deve conter de 11 a 14 caracteres");

	}

	public void validaCidade(String cidade) {

		if (cidade.length() <= 1)
			throw new IllegalArgumentException("Cidade deve conter pelo menos 2 caracteres");
	}

	public void validaBairro(String bairro) {

		if (bairro.length() <= 1)
			throw new IllegalArgumentException("Bairro deve conter pelo menos 2 caracteres");
	}

	public void validaNumeroPredial(String numeeroPredial) {

		if (rua.length() <= 1)
			throw new IllegalArgumentException("Numero deve conter pelo menos 2 caracteres");

	}

	public void validaRua(String rua) {

		if (rua.length() < 5)
			throw new IllegalArgumentException("Rua deve conter mais que 5 caracteres");

	}

	public void validaEstado(Estados estado) {

		if (estado == null)
			throw new IllegalArgumentException("Estado não pode ser nulo");

	}

	public void validaIDCliente(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("ID inválido. Deve ser maior que 0!");
		}

	}

	public void validaNomeCliente(String nome) {

		if (nome.length() < 5) {
			throw new IllegalArgumentException("O nome deve conter  mais de 5 caracteres");
		}
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

	public String getNumeroPredial() {
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

	public Estados getEstado() {
		return estado;
	}

}
