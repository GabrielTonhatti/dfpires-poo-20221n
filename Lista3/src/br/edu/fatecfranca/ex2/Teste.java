package br.edu.fatecfranca.ex2;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho(100, new Date());
		ItemCarrinho item = new ItemCarrinho(9, "Chocolate", 12, 2);
		ItemCarrinho item2 = new ItemCarrinho(8, "Bolacha", 3, 3);
		ItemCarrinho item3 = new ItemCarrinho(8, "Cerveja", 9, 24);
		
		carrinho.addItem(item);
		carrinho.addItem(item2);
		carrinho.addItem(item3);
		System.out.println(carrinho.mostrar());
		carrinho.removeItem(item2);
		System.out.println(carrinho.mostrar());
	}
	
}
