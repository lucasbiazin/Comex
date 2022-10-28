package br.com.comex.enums;

public enum Estados {
	AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;

	public String estados(String estados) {

		for (Estados estado : Estados.values()) {
			if (estado.toString().equals(estados.toUpperCase())) {

			}
		}
		return estados;
	}

}
