package br.com.comex.dao.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ComexExcepetion;
import br.com.comex.modelo.ConnectionFactory;

public class TestaInsereCliente {

	public static void main(String[] args) throws ComexExcepetion, SQLException {
		Connection conexao = new ConnectionFactory().criaConexao();
		ClienteDAO clienteDao = new ClienteDAO(conexao);

		clienteDao.salvar(new Cliente("Bartolomeu", "222.222.333-44", "(49) 9 9999-9999", "Rua da praia", "2332", "AP",
				"Centro", "Florianópolis", Estados.SC));

	}
}
