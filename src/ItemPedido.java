
public class ItemPedido {
	int id;
	double precoUnitario;
	int quantidade;
	ProdutoItemPedido produtoItemPedido;
	Pedido pedido;
	double desconto;
	int tipoDesconto = 0;

		public ItemPedido(int id, double precoUnitario, int quantidade, ProdutoItemPedido  produtoItemPedido,
				Pedido pedido, double desconto,
				int tipoDesconto) {
			
			
		this.id = id;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.produtoItemPedido = produtoItemPedido;
		this.pedido = pedido;
		this.desconto = desconto;
		this.tipoDesconto = tipoDesconto;

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

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public ProdutoItemPedido  getProduto() {
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

}
