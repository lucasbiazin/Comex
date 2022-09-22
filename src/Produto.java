import java.util.concurrent.atomic.AtomicInteger;

public class Produto {

	private static final AtomicInteger count = new AtomicInteger(0);
	int id;
	String nome;
	String descricao;
	double precoUnitario;
	int quantidadeEstoque;
	String categoria;

	
	
	


	

	/** Métodos/ **/

	public double CalculaTotal(double preco, double estoque) {

		preco = precoUnitario;
		estoque = quantidadeEstoque;
		double  valor;
		
		valor = preco * estoque;

		return  (valor);

	};

	public double CalculaImposto(double valor) {

		valor = precoUnitario * 0.4;

		return (valor);
	};

	/** Getters and Setters/ **/

	public int getId() {
		return this.id = count.incrementAndGet();
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
