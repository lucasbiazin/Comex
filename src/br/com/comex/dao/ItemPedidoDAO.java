package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.enums.EnumTipoDesconto;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class ItemPedidoDAO {
	Connection conexao;

	public ItemPedidoDAO(Connection conexao) {
		super();
		this.conexao = conexao;
	}

	public void insere(ItemPedido itemPedido) {
		String sql = "INSERT INTO comex.ITEM_PEDIDO "
				+ "( preco_unitario, quantidade, produto_id, pedido_id, desconto, tipo_desconto)"
				+ "values ( ?, ? ,?, ?, ?, ?)";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setDouble(1, itemPedido.getPrecoUnitario());
			pstm.setInt(2, itemPedido.getQuantidade());
			pstm.setInt(3, itemPedido.getProduto().getId());
			pstm.setInt(4, itemPedido.getPedido().getId());
			pstm.setDouble(5, itemPedido.filtraDescontos());
			pstm.setString(6, itemPedido.getTipo_desconto().name());

			pstm.executeQuery();

			System.out.println("Item pedido adicionado com sucesso!!!");

			pstm.close();

		} catch (Exception erro) {
			System.out.println("Erro ao inserir Item Pedido: " + erro);
		}

	}

	public void deleta(Integer id) {
		String sql = "DELETE FROM comex.ITEM_PEDIDO WHERE id = ?";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

			System.out.println("Item removido do pedido com sucesso!!!");

		} catch (Exception erro) {
			System.out.println("Erro ao deletar Item Pedido");
		}

	}

	public void atualiza(ItemPedido itemPedido) {
		String sql = "UPDATE comex.ITEM_PEDIDO SET preco_unitario = ?, quantidade = ?, produto_id = ?, "
				+ "pedido_id = ?, desconto = ?, tipo_desconto = ? where id = ?";

		try {

			PreparedStatement pstm = conexao.prepareStatement(sql);

			
			pstm.setDouble(1, itemPedido.getPrecoUnitario());
			pstm.setInt(2, itemPedido.getQuantidade());
			pstm.setInt(3, itemPedido.getProduto().getId());
			pstm.setInt(4, itemPedido.getPedido().getId());
			pstm.setDouble(5, itemPedido.getDesconto());
			pstm.setString(6, itemPedido.getTipo_desconto().name());
			pstm.setInt(7, itemPedido.getId());

			pstm.execute();
			
			
			System.out.println("Item pedido atualizado com sucesso!!!");
			pstm.close();

		} catch (Exception erro) {

			System.out.println("Erro ao atualizar item_pedido" + erro);

		}

	}

	public List<ItemPedido> lista() {
		String sql = "SELECT * FROM comex.ITEM_PEDIDO";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			List<ItemPedido> itemPedidos = new ArrayList<>();

			ResultSet registros = pstm.executeQuery();

			while (registros.next()) {
				ItemPedido pedido = this.populaItemPedido(registros);

				itemPedidos.add(pedido);

			}
			System.out.println(itemPedidos);
			pstm.close();
			registros.close();

		} catch (Exception erro) {

			System.out.println("Erro ao listar Item Pedido: " + erro);
		}

		return null;

	}

	private ItemPedido populaItemPedido(ResultSet registros) throws SQLException {
		try {
	
		
		ItemPedido itemPedido = new ItemPedido(
				registros.getDouble("preco_unitario"),
				registros.getInt("quantidade"),
				new Produto(registros.getInt("produto_id")),
				new Pedido(registros.getInt("pedido_id")),
				registros.getDouble("desconto"), 
				EnumTipoDesconto.valueOf(registros.getString("tipo_desconto")));

		itemPedido.setId(registros.getInt("id"));
		return itemPedido;
		
		
		} catch (Exception erro) {
			System.out.println("Erro ao popular Item Pedido: " + erro);
		}
		return null;
	}
	
	
	public ItemPedido buscaPorId(long id) {
		String sql = "SELECT * FROM comex.ITEM_PEDIDO where id = ?";

		try {
		
		try (PreparedStatement pstm = this.conexao.prepareStatement(sql)) {
			pstm.setLong(1, id);

			try (ResultSet registro = pstm.executeQuery()) {
				ItemPedido itemPedido = null;
				if (registro.next()) {
					itemPedido = this.populaItemPedido(registro);
				}

				return itemPedido;
			
			}
		}}catch (Exception erro) {
			System.out.println("Erro ao buscar por ID: " + erro);
		}
		return null;
	}}


