package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.enums.Estados;
import br.com.comex.modelo.Cliente;

public class ClienteDAO {

	private Connection conexao;

	public ClienteDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void salvar(Cliente cliente)  {

		String sql = "INSERT INTO comex.CLIENTE(nome, cpf, telefone, rua, numero,"
				+ " complemento, bairro, cidade, uf) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			
		
		PreparedStatement stm = conexao.prepareStatement(sql);

		stm.setString(1, cliente.getNome());
		stm.setString(2, cliente.getCpf());
		stm.setString(3, cliente.getTelefone());
		stm.setString(4, cliente.getRua());
		stm.setString(5, cliente.getNumeroPredial());
		stm.setString(6, cliente.getComplemento());
		stm.setString(7, cliente.getBairro());
		stm.setString(8, cliente.getCidade());
		stm.setString(9, cliente.getEstado().name());

		stm.executeQuery();

		System.out.println("Cliente adicionado com sucesso!!!");

		stm.close();
		} catch (Exception erro) {
			System.out.println("Erro ao adicionar o cliente " + erro);
		}

	}

	public void deletar(Integer id) throws SQLException {

		String sql = "DELETE FROM comex.CLIENTE where id = ?";

		PreparedStatement pstm = conexao.prepareStatement(sql);

		pstm.setInt(1, id);

		pstm.executeQuery();

		System.out.println("Cliente removido com sucesso!!!");

		pstm.close();

	}

	public void atualizar(Cliente cliente) throws SQLException {
		String sql = "UPDATE comex.CLIENTE SET nome = ?, cpf = ?, telefone = ?, rua = ?, numero = ?, "
				+ "complemento = ?, bairro = ?, cidade = ?, uf = ?  where id = ?";
		
		try {
			
		

		PreparedStatement pstm = conexao.prepareStatement(sql);

		pstm.setString(1, cliente.getNome());
		pstm.setNString(2, cliente.getCpf());
		pstm.setNString(3, cliente.getTelefone());
		pstm.setNString(4, cliente.getRua());
		pstm.setNString(5, cliente.getNumeroPredial());
		pstm.setNString(6, cliente.getComplemento());
		pstm.setNString(7, cliente.getBairro());
		pstm.setNString(8, cliente.getCidade());
		pstm.setString(9, cliente.getEstado().name());
		pstm.setLong(10, cliente.getId());

		pstm.execute();

		System.out.println("Cliente alterado com sucesso!!!");
		pstm.close();
		
		} catch (Exception erro) {
		System.out.println("Erro ao atualizar cliente "+ erro);
			
		}

	}

	public List<Cliente> listar()  {
		String sql = "SELECT * FROM comex.CLIENTE";
		
		try {
			
		
		PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

		List<Cliente> clientes = new ArrayList<>();
		ResultSet registros = comandoPreparado.executeQuery();
		Cliente cliente = null;
		while (registros.next()) {
			 cliente = this.populaCliente(registros);

			cliente.setId(registros.getInt("id"));
			clientes.add(cliente);
		}
		System.out.println(clientes);
		comandoPreparado.close();

		return clientes;
		} catch (Exception erro) {
			System.out.println("Erro ao listar clientes " + erro);
		}
		return null;
		

	}
	
	private Cliente populaCliente(ResultSet registros)  {
		
		try {
			
		
		
		Cliente cliente = new Cliente(
				registros.getString("nome"), 
				registros.getString("cpf"),
				registros.getString("telefone"), 
				registros.getString("rua"), 
				registros.getString("numero"),
				registros.getString("complemento"),	
				registros.getString("bairro"), 
				registros.getString("cidade"),
				Estados.valueOf((registros.getString("uf"))));
		
				cliente.setId(registros.getInt("id"));;
		return cliente;
		
		} catch (Exception erro) {
			System.out.println("erro ao popular cliente "+ erro);
		}
		return null;
	}


}
