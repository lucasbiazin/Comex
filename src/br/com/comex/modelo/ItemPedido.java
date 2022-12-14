package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.comex.enums.EnumTipoDesconto;

@XmlRootElement
public class ItemPedido {

	private int id;
	private double precoUnitario;
	private int quantidade;
	private Produto produtoItemPedido;
	private Pedido pedido;
	private double desconto;
	private int tipoDesconto = 0;
	private EnumTipoDesconto tipo_desconto;

	public ItemPedido(double precoUnitario, int quantidade, Produto produtoItemPedido, Pedido pedido, double desconto,
			int tipoDesconto) {

		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.produtoItemPedido = produtoItemPedido;
		this.pedido = pedido;
		this.desconto = this.filtraDescontos();
		this.tipoDesconto = tipoDesconto;

	}

	public ItemPedido(double precoUnitario, Integer quantidade, Produto produtoItemPedido, Pedido pedido,
			double desconto, EnumTipoDesconto tipo_desconto) {

		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.produtoItemPedido = produtoItemPedido;
		this.pedido = pedido;
		this.desconto = this.filtraDescontos();
		this.tipo_desconto = tipo_desconto;
	}

	public ItemPedido(Integer id) {

		this.id = id;
	
	}
	
	public ItemPedido() {

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

	public String toString() {

		return "      ID: " + "|" + this.id + "|" + "Preço unitário:  " + this.precoUnitario + "|" + "         "
				+ "Quantidade: " + this.quantidade + "         " + "ID do produto: " + this.produtoItemPedido.getId()
				+ "|" + "  " + " ID do pedido: " + this.pedido.getId() + "      "

				+ "Desconto: " + "|" + this.filtraDescontos() + "|" + "                      " +

				"|" + "Tipo de desconto: " + this.getTipoDesconto() + " " + "|" + "              "
				+ "Produto sem desconto: " + this.getDesconto() + "|" + " " + "              " + "Total com descontos: "
				+ this.filtraDescontos() + "|" + System.lineSeparator() + System.lineSeparator();
	}

	public void setId(int id) {
		this.id = id;
	}

//	public String toString() {
//		return "ItemPedido [id=" + this.id + ", precoUnitario=" + this.precoUnitario + ", quantidade=" + this.quantidade
//				+ ", produtoItemPedido=" + produtoItemPedido + ", pedido=" + pedido + ", desconto=" + desconto
//				+ ", tipo_desconto=" + tipo_desconto + "]";
//	}

	

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProdutoItemPedido() {
		return produtoItemPedido;
	}

	public void setProdutoItemPedido(Produto produtoItemPedido) {
		this.produtoItemPedido = produtoItemPedido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getTipoDesconto() {
		return tipoDesconto;
	}

	public void setTipoDesconto(int tipoDesconto) {
		this.tipoDesconto = tipoDesconto;
	}

	public EnumTipoDesconto getTipo_desconto() {
		return tipo_desconto;
	}

	public void setTipo_desconto(EnumTipoDesconto tipo_desconto) {
		this.tipo_desconto = tipo_desconto;
	}

	public int getId() {
		return id;
	}
}
