package br.com.comex.dao.main.cliente;

import java.sql.Connection;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;

public class TesteRemocaoCliente {
	
	public static void main(String[] args) {
		
		try {
			
		
		Connection conexao = new ConnectionFactory().criaConexao();
		
		ClienteDAO clienteDao = new ClienteDAO(conexao);
		
		
		clienteDao.deletar(28);
		
		} catch (Exception erro) {
			System.out.println(erro);
		
		}
		
		
	}

}
