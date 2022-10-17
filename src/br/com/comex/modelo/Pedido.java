package br.com.comex.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Pedido {

	private static final AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String data;
	private Cliente cliente;

	
	public Pedido(Integer id) throws ComexExcepetion {
		
		this.id = id;
		
		
	}
	
	
	public Pedido(String data, Cliente cliente) throws ComexExcepetion {

		this.id = count.incrementAndGet();
		this.data = data;
		this.cliente = cliente;

	}

	public Pedido() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {

		return "ID Pedido: " + "|" + this.id + "|"  +  System.lineSeparator()
	+ "Data do pedido: "+ "   " + "|" + this.data + "|" + "   " 
	+  System.lineSeparator()+ "ID do cliente: "		+ "|" + this.cliente.getId() + "|"+  System.lineSeparator()
				+ System.lineSeparator();
	}

}
