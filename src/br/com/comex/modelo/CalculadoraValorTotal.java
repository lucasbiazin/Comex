package br.com.comex.modelo;

public class CalculadoraValorTotal extends ItemPedido {

	double valorTotal;

	public CalculadoraValorTotal(double precoUnitario, int quantidade, Produto produtoItemPedido, Pedido pedido,
			double desconto, int tipoDesconto, double valorTotal) {
		super(precoUnitario, quantidade, produtoItemPedido, pedido, desconto, tipoDesconto);

		this.valorTotal = valorTotal;
	}

	public double calcula(int quantidade, double precoUnitario) {

		valorTotal = quantidade * precoUnitario;

		return valorTotal;
	}

}
