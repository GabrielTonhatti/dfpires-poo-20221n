package br.edu.fatecfranca.exo;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Conta c1 = new Conta("0102341-1", "3259", "Fulano", 1000);
		
		Cartao ca1 = new Cartao(1234, new Date(), 186, "Visa", c1, "123456");
		ca1.mostra();
		
	}

}
