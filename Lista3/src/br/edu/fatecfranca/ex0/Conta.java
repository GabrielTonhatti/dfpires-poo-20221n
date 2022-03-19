package br.edu.fatecfranca.ex0;

public class Conta {

	private String numero, agencia, nome;
	private float saldo;

	public Conta() {
	}

	public Conta(String numero, String agencia, String nome, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo não pode ficar negativa");
		}
	}

	public String mostra() {
		return String.format("Número: %s, agência: %s, nome: %s, saldo: %.2f", this.numero, this.agencia,
				this.nome, this.saldo);
	}

}
