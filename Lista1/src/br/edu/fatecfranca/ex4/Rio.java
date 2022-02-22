package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class Rio {

	String nome;
	float nivel;
	boolean poluido;

	public Rio() {

	}

	public Rio(String nome, float nivel, boolean poluido) {
		this.nome = nome;
		this.nivel = nivel;
		this.poluido = poluido;
	}

	void chover(float x) {
		this.nivel += x;
	}

	void ensolarar(float x) {
		this.nivel -= x;
	}

	void limpar() {
		this.poluido = false;
	}

	void sujar() {
		this.poluido = true;
	}

	void mostrar() {
		JOptionPane.showMessageDialog(null,
				String.format("Nome: %s, nível: %.2f, poluído: %b", this.nome, this.nivel, this.poluido));
	}

}
