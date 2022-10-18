package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class PedidoDAO {

	Connection conexao;

	public PedidoDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void insere(Pedido pedido) {
		String sql = "INSERT INTO  comex.PEDIDO ( data, cliente_id) values ( ? ,?)";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setString(1, pedido.getData());
			pstm.setInt(2, pedido.getCliente().getId());

			pstm.executeQuery();

			System.out.println("Pedido adicionado com sucesso!!!");

			pstm.close();

		} catch (Exception erro) {
			System.out.println("Erro ao salvar pedido " + erro);

		}

	}

	public void deleta(Integer id) {

		String sql = "DELETE FROM comex.PEDIDO WHERE ID = ?";

		try {

			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

			System.out.println("Pedido removido com sucesso :");

		} catch (Exception erro) {

			System.out.println("Erro ao deletar pedido: " + erro);

		}

	}

	public void atualiza(Pedido pedido) {

		String sql = "UPDATE comex.PEDIDO SET data, cliente_id WHERE id = ?";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setString(1, pedido.getData());
			pstm.setInt(2, pedido.getCliente().getId());

			pstm.executeQuery();

		} catch (Exception erro) {
			System.out.println("Erro ao atualizar pedido: " + erro);
		}

	}

	public List<Pedido> listar() {
		String sql = "SELECT * FROM comex.PEDIDO";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			List<Pedido> pedidos = new ArrayList<>();

			ResultSet registros = pstm.executeQuery();

			while (registros.next()) {
				Pedido pedido = this.populaPedido(registros);

				pedidos.add(pedido);

			}
			System.out.println(pedidos);
			pstm.close();
			registros.close();
			return pedidos;

		} catch (Exception erro) {
			System.out.println("Erro ao listar pedidos: " + erro);
		}

		return null;

	}

// Métodos

	public Pedido buscaPorId(long id) {
		String sql = "SELECT * FROM comex.PEDIDO where id = ?";

		try (PreparedStatement pstm = this.conexao.prepareStatement(sql)) {
			pstm.setLong(1, id);

			try (ResultSet registro = pstm.executeQuery()) {
				Pedido pedido = null;
				if (registro.next()) {
					pedido = this.populaPedido(registro);
				}
				pstm.close();
				return pedido;
			}
		} catch (Exception erro) {
			System.out.println("Erro ao buscar pedido por id :" + erro);

		}
		return null;
	}

	private Pedido populaPedido(ResultSet registros) {
		try {
			Pedido pedido = new Pedido(

					registros.getString("data"), 
					new Cliente(registros.getInt("cliente_id")));

			pedido.setId(registros.getInt("id"));

			return pedido;
		} catch (Exception erro) {
			System.out.println("Erro ao popular pediodo: " + erro);
		}
		;

		return null;

	}
}
