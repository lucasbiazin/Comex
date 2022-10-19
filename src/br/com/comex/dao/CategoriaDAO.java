package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;

public class CategoriaDAO {

	private Connection conexao;

	public CategoriaDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void atualiza(Categoria categoria) throws SQLException {
		String sql = "UPDATE comex.CATEGORIA SET nome = ?, status = ? WHERE id = ?";
		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setString(1, categoria.getNome());
			pstm.setString(2, categoria.SetStatus().name());
			pstm.setInt(3, categoria.getId());

			pstm.executeQuery();

			System.out.println("Categoria alterada com sucesso!!!");

			pstm.close();

		} catch (Exception erro) {
			System.out.println("Erro ao atualizar: " + erro);
		}

	}

	public void salvar(Categoria categoria) {

		String sql = "INSERT INTO comex.CATEGORIA(nome, status)" + "VALUES (?, ?)";
		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setString(1, categoria.getNome());
			pstm.setString(2, categoria.SetStatus().name());
			pstm.execute();

			System.out.println("Categoria inserida com sucesso!!!");

			pstm.close();

		} catch (Exception erro) {
			System.out.println("Erro ao salvar " + erro);

		}
	}

	public void deletar(Integer id) {

		String sql = "DELETE FROM comex.CATEGORIA where id = ?";

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);

			pstm.setInt(1, id);
			pstm.execute();

			System.out.println("Categoria removida com sucesso!!!");
			pstm.close();

		} catch (Exception erro) {
			System.out.println("Erro ao deletar " + erro);

		}

	}

	public List<Categoria> listar() {
		String sql = "SELECT * FROM comex.CATEGORIA";
		try {

			PreparedStatement pstm = conexao.prepareStatement(sql);

			List<Categoria> categorias = new ArrayList<>();
			ResultSet registros = pstm.executeQuery();
			while (registros.next()) {
				Categoria categoria = this.populaCategoria(registros);

				categorias.add(categoria);
			}

			pstm.close();
			System.out.println(categorias);
			return categorias;

		} catch (Exception erro) {
			System.out.println("Erro ao listar " + erro);
		}
		return null;

	}

	public Categoria buscaPorId(long id) throws SQLException {
		String sql = "SELECT * FROM comex.CATEGORIA where id = ?";

		try (PreparedStatement pstm = this.conexao.prepareStatement(sql)) {
			pstm.setLong(1, id);

			try (ResultSet registro = pstm.executeQuery()) {
				Categoria categoria = null;
				if (registro.next()) {
					categoria = this.populaCategoria(registro);
				}
				pstm.close();
				return categoria;
			}
		} catch (Exception erro) {
			System.out.println("Erro ao buscar por id :" + erro);

		}
		return null;
	}

	private Categoria populaCategoria(ResultSet registros) throws SQLException {
		Categoria categoria = new Categoria(registros.getString("nome"),
				StatusCategoria.valueOf(registros.getString("status")));

		categoria.setId(registros.getInt("id"));
		;
		return categoria;
	}

}
