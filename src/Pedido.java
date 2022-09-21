import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Pedido   {
	int id;
	String data;
	Cliente cliente;
	private static int total = 0;




	

	public Pedido(int id, String data, Cliente cliente) {
		
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		Pedido.total++;
	
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
	public static int getTotal() {
		return Pedido.total;
	}
	}


