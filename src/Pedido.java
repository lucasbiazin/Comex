import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;


public class Pedido   {
	
	private static final AtomicInteger count = new AtomicInteger(0); 
	int id;
	String data;
	Cliente cliente;
	




	

	public Pedido( String data, Cliente cliente) {
		
		this.id = count.incrementAndGet();
		this.data = data;
		this.cliente = cliente;
		
	
	}

	public final static DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static String formattedDate(LocalDate date) {
		if (date == null)
			return "Data incosistente!";
		return formataData.format(date);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	}


