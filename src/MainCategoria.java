
public class MainCategoria {

	public static void main(String[] args) {

		Categoria categoria = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", Status.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", Status.ATIVA);

		System.out.println(categoria.id + " " + categoria.nome + " " + categoria.status);
		System.out.println(categoria2.id + " " + categoria2.nome + " " + categoria2.status);
		System.out.println(categoria3.id + " " + categoria3.nome + " " + categoria3.status);

	}

}
