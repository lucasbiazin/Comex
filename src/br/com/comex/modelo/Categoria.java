package br.com.comex.modelo;

import br.com.comex.enums.Status;
import java.util.concurrent.atomic.AtomicInteger;

public class Categoria {

	private static final AtomicInteger count = new AtomicInteger(0);
	int id;
	private String nome;
	Status status;

	public Categoria(String nome, Status status) throws ComexExcepetion{
		validaID(id);
		this.id = count.incrementAndGet();
		
		
		validaNome(nome);
		this.setNome(nome);

		validaStatus(status);
		this.status = status;

	}

	public static boolean validaString(String nome) {
       if ( nome.matches("[a-zA-Z-]+"));
       throw new IllegalArgumentException("Só são aceitos nomes com letras");
    }
	
	
	
	public void validaStatus(Status status) throws ComexExcepetion{

		if (status == null)
		throw new ComexExcepetion("Status não pode ser nulo");

	}

	public void validaID(int id) throws ComexExcepetion{
		if (id < 0) {
			throw new ComexExcepetion("ID inválido.");
		}

	}

	public void validaNome(String nome) throws ComexExcepetion{

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

	public Status isStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {

		return this.id + " - " + this.nome + " " + "Status :" + this.status;
	}

}
