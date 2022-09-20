
public class MainCategoria {

	public static void main(String[] args) {
	
	Categoria categoria =	new Categoria();
		
		categoria.id = 1;
		categoria.nome =  "INFORMÁTICA";
		categoria.status = true;
		
		Categoria categoria2 =	new Categoria();
				
		categoria2.id = 2;
		categoria2.nome =  "MÓVEIS";
		categoria2.status = false;
		
		Categoria categoria3 =	new Categoria();
		
		categoria3.id = 3;
		categoria3.nome =  "LIVROS";
		categoria3.status = true;
		
	
		System.out.println(categoria.id  + categoria.nome + categoria.status);
		System.out.println(categoria2.id  + categoria2.nome + categoria2.status);
		System.out.println(categoria3.id  + categoria3.nome + categoria3.status);
		
	}

}
