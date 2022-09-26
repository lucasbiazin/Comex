import java.util.concurrent.atomic.AtomicInteger;

public class Categoria {

	private static final AtomicInteger count = new AtomicInteger(0); 
	int id;
	String nome;
	Status status;
	
	
	public Categoria( String nome, Status status) {
		
		this.id = count.incrementAndGet();
		this.nome = nome;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categoria getNome(Categoria nome) {
		return nome;
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
	
}
