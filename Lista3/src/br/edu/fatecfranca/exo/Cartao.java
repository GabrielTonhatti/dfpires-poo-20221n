package br.edu.fatecfranca.exo;

import java.util.Date;

public class Cartao {

	private int numero;
	private Date validade;
	private int cvv;
	private String bandeira;
	private Conta conta; // Associação
	private String senha;

	public Cartao() {
	}

	public Cartao(int numero, Date validade, int cvv, String bandeira, Conta conta, String senha) {
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

	public void mostra() {
		System.out.printf("Número: %d, CVV: %d, validade: %tc, bandeira: %s%n", this.numero, this.cvv, this.validade,
				this.bandeira);
		this.conta.mostra();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void sacar() {
		// TODO efetive o saque, o saldo não pode ficar negativo
	}

}
