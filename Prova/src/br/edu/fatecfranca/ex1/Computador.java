package br.edu.fatecfranca.ex1;

import static javax.swing.JOptionPane.showMessageDialog;

public class Computador {

	private int memoria;
	private boolean ligado;

	public Computador() {

	}

	public Computador(int memoria, boolean ligado) {
		this.setMemoria(memoria);
		this.ligado = ligado;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		if (memoria % 4 == 0 && (memoria < 32 || memoria > 0)) {
			this.memoria = memoria;
			showMessageDialog(null, "Adicionando memória RAM...");
		} else if (memoria > 32) {
			this.memoria = 0;
			showMessageDialog(null, "O máximo de memória que é possível adicionar no computador é de 32GB!");
		} else {
			this.memoria = 0;
			showMessageDialog(null,
					"Não foi possível adicionar mais memória RAM pois a quantidade informada é inválida, adicione até 4, 8, 16 ou 32 GB.");
		}
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		this.ligado = true;
		showMessageDialog(null, "Ligando o computador...");
	}

	public void desligar() {
		this.ligado = false;
		showMessageDialog(null, "Desligando o computador...");
	}

	public void upgrade(int x) {
		if (x % 4 == 0 && (x < 32 || x > 0)) {
			this.memoria += x;
			showMessageDialog(null, "Fazendo upgrade de memória RAM...");
		} else if (x > 32) {
			this.memoria = 0;
			showMessageDialog(null, "O máximo de memória que é possível adicionar no computador é de 32GB!");
		} else {
			this.memoria = 0;
			showMessageDialog(null,
					"Não foi possível adicionar mais memória RAM pois a quantidade informada é inválida, adicione até 4, 8, 16 ou 32 GB.");
		}

	}

}
