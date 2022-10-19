package br.com.comex.command;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.modelo.ConnectionFactory;

public class Transacao {

	private List<Command> comandos;
	
	public Transacao(List<Command> comandos) {
		this.comandos = comandos;
	}
	

	private void executaComandos() throws Exception {
		
		Connection connect = new ConnectionFactory().criaConexao();
		
		try {
			connect.setAutoCommit(false);
			
			for (Command command : comandos) {
				command.execute();
				connect.commit();
			}
		}
		
		catch (SQLException erro) {
			connect.rollback();
			System.out.println("Erro ao executar comandos: " + erro );
		}
		finally {
			connect.close();
		}
	}	
}
