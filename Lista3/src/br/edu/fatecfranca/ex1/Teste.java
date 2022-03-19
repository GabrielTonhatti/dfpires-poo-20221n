package br.edu.fatecfranca.ex1;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Passageiro passageiro = new Passageiro("Fulano", "12345678901");
		Voo voo = new Voo(1, "São Paulo", "Curitiba");
		Reserva reserva = new Reserva(1, new Date(), passageiro, voo);
		
		System.out.println(reserva.mostra());
	}
	
}
