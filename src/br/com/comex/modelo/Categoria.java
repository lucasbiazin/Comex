package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.comex.enums.StatusCategoria;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Categoria {


	private int id;
    @XmlElement(required = true)
	private String nome;
	private StatusCategoria status = StatusCategoria.ATIVA;
	


	public Categoria(String nome, StatusCategoria status) throws ComexExcepetion {
	
		validaNome(nome);
		this.nome = nome;

		validaStatus(status);
		this.status = status;

	}
	
	public Categoria() {
	
	}

	public Categoria(String nome) {
		this.nome = nome;
		validaStatus(status);
		this.status = StatusCategoria.ATIVA;
		
	}


	public Categoria(int id) {
		super();
		this.id = id;
	
	}

	public static boolean validaString(String nome) {
		if (nome.matches("[a-zA-Z-]+"))
			;
		throw new IllegalArgumentException("Só são aceitos nomes com letras");
	}

	public void validaStatus(StatusCategoria status) throws ComexExcepetion {

		if (status == null)
			throw new ComexExcepetion("Status não pode ser nulo");

	}

	public void validaID(int id) throws ComexExcepetion {
		if (id < 0) {
			throw new ComexExcepetion("ID inválido.");
		}

	}

	public void validaNome(String nome) throws ComexExcepetion {

		if (nome.length() < 3) {
			throw new ComexExcepetion("Nome deve conter mais que 3 caracteres");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusCategoria SetStatus() {
		return status = StatusCategoria.ATIVA;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {

		return this.id + " - " + this.nome + " " + "Status :" + this.status
				+ System.lineSeparator();
	}



}
