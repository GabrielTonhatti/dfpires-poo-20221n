package br.edu.fatecfranca.ex0;

import java.util.Date;

public class Cartao {

	private int numero;
	private Date validade;
	private int cvv;
	private String bandeira;
	private Conta conta; // Associação
	private int senha;

	public Cartao() {
	}

	public Cartao(int numero, Date validade, int cvv, String bandeira, Conta conta, int senha) {
		this.numero = numero;
		this.validade = validade;
		this.cvv = cvv;
		this.bandeira = bandeira;
		this.conta = conta;
		this.senha = senha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String mostra() {
		return String.format("Número: %d, CVV: %d, validade: %tc, bandeira: %s, Conta: %s", this.numero, this.cvv,
				this.validade, this.bandeira, this.conta.mostra());
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void sacar(float x, int senha) {
		if (senha == this.senha) { // verifica a senha
			Date atual = new Date(); // data atual

			if (atual.before(this.validade)) {
				this.conta.setSaldo(this.conta.getSaldo() - x);
			} else {
				System.out.println("Cartão vencido");
			}

		} else {
			System.out.println("Senha inválida");
		}
	}

}
