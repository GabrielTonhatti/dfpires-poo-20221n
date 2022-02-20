package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {

	int numeroConta;
	int numeroAgencia;
	String nome;
	float saldo;

	public Cliente() {

	}

	public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void realizarDeposito(float deposito) {
		if (deposito > 0)
			this.saldo += deposito;
		else
			JOptionPane.showMessageDialog(null, "O valor de depósito não pode ser menor ou igual a 0");
	}

	public void realizarSaque(float saque) {
		if (this.saldo >= saque)
			this.saldo -= saque;
		else
			JOptionPane.showMessageDialog(null, String.format(
					"O seu saldo atual é de: R$ %.2f. O" + " valor do saque não pode ser maior do que o saldo atual!",
					this.saldo));
	}

	public void dados() {
		JOptionPane.showMessageDialog(null, String.format("Número da conta: %d, nome: %s, saldo atual: %.2f",
				this.numeroConta, this.nome, this.saldo));
	}

}
