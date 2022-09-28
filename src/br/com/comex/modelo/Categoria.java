package br.com.comex.modelo;

import br.com.comex.enums.Status;
import java.util.concurrent.atomic.AtomicInteger;

public class Categoria {

	private static final AtomicInteger count = new AtomicInteger(0);
	int id;
	private String nome;
	Status status;

	public Categoria(String nome, Status status) {
		validaID(id);
		this.id = count.incrementAndGet();
		validaNome(nome);
		this.setNome(nome);

		validaStatus(status);
		this.status = status;

	}
	
	
	public void validaStatus(Status status) {
		
		if (status != null)
			throw new IllegalArgumentException("Status não pode ser nulo");
		
	}

	public void validaID(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("ID inválido.");
		}

	}

	public void validaNome(String nome) {

		if (nome.length() < 3) {
			throw new IllegalArgumentException("O nome deve conter 3 ou mais caracteres");
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

	public Status isStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

}
