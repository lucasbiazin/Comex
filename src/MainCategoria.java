
public class MainCategoria {

	public static void main(String[] args) {
		System.out.println(" ----------------------Categorias-----------------------");
		System.out.println(" ");
		Categoria categoria1 = new Categoria("INFORMÁTICA", Status.ATIVA);
		Categoria categoria2 = new Categoria("MÓVEIS", Status.INATIVA);
		Categoria categoria3 = new Categoria("LIVROS", Status.ATIVA);
		
		System.out.println(categoria1.id + " " + categoria1.nome + " Status:" + categoria1.status + " ");
		System.out.println(categoria2.id + " " + categoria2.nome + " Status:" + categoria2.status + " ");
		System.out.println(categoria3.id + " " + categoria3.nome + " Status:" + categoria3.status + " ");
		System.out.println(" ");
		System.out.println(" -------------------------------------------------------");

	}

}
