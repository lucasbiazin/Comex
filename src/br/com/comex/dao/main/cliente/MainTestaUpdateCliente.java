package br.com.comex.dao.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;

public class MainTestaUpdateCliente {

	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().criaConexao();

		ClienteDAO clienteLucas = new ClienteDAO(conexao);

		clienteLucas.atualizar(new Cliente("Lucas Biazin", "422.222.333-44", "(49) 9 9999-9999", "Rua da praia", "2332",
				"AP", "Centro", "Florianópolis", Estados.SC));

	}

}
