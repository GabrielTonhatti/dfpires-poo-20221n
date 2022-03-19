package br.edu.fatecfranca.ex0;

import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		Conta c1 = new Conta("0102341-1", "3259", "Fulano", 1000);
		Calendar val = Calendar.getInstance();
		val.set(Calendar.YEAR, 2023); // Define o ano
		val.set(Calendar.MONTH, 2); // Define o mês
		val.set(Calendar.DAY_OF_MONTH, 10); // Define o dia
		// val é um Calendar, devemos transforma-lo para Date
		// val.getTime() transforma val em Date
		
		Cartao ca1 = new Cartao(1234, val.getTime(), 186, "Visa", c1, 9876);
		System.out.println(ca1.mostra());
		ca1.sacar(600, 9876);
		System.out.println(ca1.mostra());
		
	}

}
