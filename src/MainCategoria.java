
public class MainCategoria {

	public static void main(String[] args) {
	
	Categoria categoria =	new Categoria();
		
		categoria.setId(1);
		categoria.setNome("INFORMÁTICA"); 
		categoria.setStatus(true);
		
		Categoria categoria2 =	new Categoria();
				
		categoria2.setId(2);
		categoria2.setNome("MÓVEIS");
		categoria2.setStatus(false);
		
		Categoria categoria3 =	new Categoria();
		
		categoria3.setId(3);
		categoria3.setNome("LIVROS");
		categoria3.setStatus(true);
		
	
		System.out.println(categoria.id  + categoria.nome + categoria.status);
		System.out.println(categoria2.id  + categoria2.nome + categoria2.status);
		System.out.println(categoria3.id  + categoria3.nome + categoria3.status);
		
	}

}
