package br.com.comex.modelo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.comex.enums.EnumTipoDesconto;

public class ItemPedido {

	private static final AtomicInteger count = new AtomicInteger(0);
	private int id;
	private double precoUnitario;
	private int quantidade;
	private Produto produtoItemPedido;
	private Pedido pedido;
	private double desconto;
	private int tipoDesconto = 0;
	private EnumTipoDesconto tipo_desconto;

	Locale localeBR = new Locale("pt", "BR");
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

	public ItemPedido(double precoUnitario, int quantidade, Produto produtoItemPedido, Pedido pedido, double desconto,
			int tipoDesconto) {

		this.id = count.incrementAndGet();
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.produtoItemPedido = produtoItemPedido;
		this.pedido = pedido;
		this.desconto = desconto;
		this.tipoDesconto = tipoDesconto;

	}

	public ItemPedido(double precoUnitario, Integer quantidade, Produto produtoItemPedido, Pedido pedido,
			double desconto, EnumTipoDesconto tipo_desconto) {

		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.produtoItemPedido = produtoItemPedido;
		this.pedido = pedido;
		this.desconto = desconto;
		this.tipo_desconto = tipo_desconto;
	}

	public ItemPedido(Integer id) {

		this.id = id;
	}

	

	public double filtraDescontos() {

		if (this.tipoDesconto == 0) {
			return this.precoUnitario * this.quantidade;

		} else if (this.quantidade > 10) {
			double quantidade;

			quantidade = this.precoUnitario * this.quantidade * 0.10;
			return this.precoUnitario * this.quantidade - quantidade;
		} else if (this.tipoDesconto == 1) {

			double promocao;
			promocao = this.precoUnitario * this.quantidade * 0.20;
			return this.precoUnitario * this.quantidade - promocao;

		}
		return 0;
	}

	public int getId() {
		return id;
	}

	public EnumTipoDesconto getTipo_desconto() {
		return tipo_desconto;

	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produtoItemPedido;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public double getDesconto() {
		return this.desconto;
	}

	public int getTipoDesconto() {
		return this.tipoDesconto;
	}

	public double SemDesconto() {
		return this.precoUnitario * this.quantidade;
	}

	@Override
	public String toString() {

		return "      ID: " + "|" + this.id + "|" + "Preço unitário:  " + dinheiro.format(this.precoUnitario) + "|"
				+ "         " + "Quantidade: " + this.quantidade + "         "  + "ID do produto: "
				+ this.produtoItemPedido.getId() + "|" + "  " + " ID do pedido: " + this.pedido.getId() + "      "

				+ "Desconto: " + "|" + this.filtraDescontos() + "|" + "                      " +

				"|" + "Tipo de desconto: " + this.getTipoDesconto() + " " + "|" + "              "
				+ "Produto sem desconto: " + dinheiro.format(this.SemDesconto()) + "|" + " " + "              "
				+ "Total com descontos: " + dinheiro.format(this.filtraDescontos()) + "|" + System.lineSeparator()
				+ System.lineSeparator();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setProdutoItemPedido(Produto produtoItemPedido) {
		this.produtoItemPedido = produtoItemPedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void setTipoDesconto(int tipoDesconto) {
		this.tipoDesconto = tipoDesconto;
	}
	public ItemPedido() {
		
	}

	public void setTipo_desconto(EnumTipoDesconto tipo_desconto) {
		this.tipo_desconto = tipo_desconto;
	}

	public void setLocaleBR(Locale localeBR) {
		this.localeBR = localeBR;
	}

	public void setDinheiro(NumberFormat dinheiro) {
		this.dinheiro = dinheiro;
	}

}
