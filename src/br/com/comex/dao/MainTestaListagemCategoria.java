package br.com.comex.dao;

import java.sql.Connection;

import br.com.comex.modelo.ConnectionFactory;

public class MainTestaListagemCategoria {

	public static void main(String[] args) {
		
		try {
			
			Connection conexao = new ConnectionFactory().criaConexao();

			CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
			
			
			categoriaDao.listar();
			
			
			
			
		} catch (Exception erro) {
			System.out.println("Erro ao rodar classe MainTestaListagemCategoria :" + erro);
		}
		
		
	}

}
