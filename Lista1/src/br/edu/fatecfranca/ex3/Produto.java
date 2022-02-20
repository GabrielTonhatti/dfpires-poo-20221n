package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class Produto {

	int id;
	String descricao;
	int qtde;
	float preco;

	public Produto() {
	}

	public Produto(int id, String descricao, int qtde, float preco) {
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.preco = preco;
	}

	public void comprar(int x) {
		if (x > 0) this.qtde += x;
		else JOptionPane.showMessageDialog(null, "Não é possível comprar uma quantidade menor do que 0!");
	}

	public void vender(int x) {
		if (this.qtde >= x) this.qtde -= x;
		else JOptionPane.showMessageDialog(null,
				"Não é possível vender uma quantidade maior do que a quantidade de estoque!");
	}

	public void subir(float x) {
		if (x > 0) this.preco = x;
		else JOptionPane.showMessageDialog(null, "O valor do produto não pode ser menor do que 0!");
	}

	public void descer(float x) {
		if (x > 0) this.preco = x;
		else JOptionPane.showMessageDialog(null, "O valor do produto não pode ser menor do que 0!");
	}

	public void mostrar() {
		JOptionPane.showMessageDialog(null, String.format("Id: %d, descrição: %s, quantidade: %s, preço: %.2f", this.id,
				this.descricao, this.qtde, this.preco));
	}

}
