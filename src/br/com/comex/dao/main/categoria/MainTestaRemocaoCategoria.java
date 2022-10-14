package br.com.comex.dao.main.categoria;

import java.sql.Connection;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaRemocaoCategoria {
	
public static void main(String[] args) {
	
	
	try {
		
		Connection conexao = new ConnectionFactory().criaConexao();

		CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
		 categoriaDao.deletar(48);
		
		
		
	} catch (Exception erro) {
	System.out.println("Erro ao rodar main testa remoção :" + erro);
	}
	
	
	
}
	
	
}
