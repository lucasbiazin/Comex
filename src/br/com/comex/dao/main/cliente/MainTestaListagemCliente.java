package br.com.comex.dao.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaListagemCliente {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().criaConexao();

		ClienteDAO clienteDao = new ClienteDAO(conexao);
		
		clienteDao.listar();

	}

}
