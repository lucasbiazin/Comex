package br.com.comex.enums;

public enum StatusCategoria {

	ATIVA, INATIVA;

	public static StatusCategoria getCategoria(String cat) {
		for (StatusCategoria categoria : StatusCategoria.values()) {
			if (categoria.toString().equals(cat.toUpperCase())) {
				return categoria;

			}

		}
		return null;

	}

}
