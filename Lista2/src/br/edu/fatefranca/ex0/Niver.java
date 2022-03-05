package br.edu.fatefranca.ex0;

import java.util.Arrays;
import java.util.List;

public class Niver {

	private int dia;
	private String mes;

	public Niver() {

	}

	public Niver(int dia, String mes) {
		this.setDia(dia);
		this.setMes(mes);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if ((dia >= 1) && (dia <= 31)) {
			this.dia = dia;
		} else {
			this.dia = 0;
			System.out.println("Dia inválido!");
		}
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		List<String> vetor = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro");

		if (vetor.contains(mes)) {
			this.mes = mes;
		} else {
			this.mes = "Inválido";
			System.out.println("Mês inválido!");
		}

	}

}
