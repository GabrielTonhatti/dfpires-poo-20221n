package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class Produto {

	int id;
	String descricao;
	int qtde;
	float preco;

	public Produto() {
		super();
	}

	public Produto(int id, String descricao, int qtde, float preco) {
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.preco = preco;
	}

	public void comprar(int x) {
		this.qtde += x;
	}

	public void vender(int x) {
		this.qtde -= x;
	}

	public void subir(int x) {
		this.preco += x;
	}

	public void descer(int x) {
		this.preco -= x;
	}

	public void mostrar() {
		JOptionPane.showMessageDialog(null, String.format("Id: %d, descrição: %s, quantidade: %s, preço: %.2f", this.id,
				this.descricao, this.qtde, this.preco));
	}

}
