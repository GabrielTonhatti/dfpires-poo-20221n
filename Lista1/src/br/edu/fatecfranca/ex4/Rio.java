package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class Rio {

	String nome;
	float nivel;
	boolean poluido;

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
		JOptionPane.showConfirmDialog(null,
				"Nome: " + this.nome + ", nível: " + this.nivel + ", poluído: " + this.poluido);
	}

}
