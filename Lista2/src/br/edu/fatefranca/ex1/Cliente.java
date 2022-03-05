package br.edu.fatefranca.ex1;

public class Cliente {

	private String numeroConta;
	private String numeroAgencia;
	private String nome;
	private float saldo;

	public Cliente() {
	}

	public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		if (numeroConta.length() == 8) {
			if (numeroConta.charAt(6) == '-') {
				this.numeroConta = numeroConta;
			} else {
				this.numeroConta = "Inválido";
				System.out.println("Número da conta deve conter o DV!");
			}
		} else {
			this.numeroConta = "Inválido";
			System.out.println("Número da conta deve ter tamanho 8");
		}
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		if (numeroAgencia.length() == 6) {
			if (numeroConta.charAt(4) == '-') {
				this.numeroAgencia = numeroAgencia;
			} else {
				this.numeroConta = "Inválido";
				System.out.println("Número da agência deve contem o DV!");
			}
		} else {
			this.numeroConta = "Inválido";
			System.out.println("Número da agência deve ter tamanho 6!");
		}
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
		this.saldo = saldo;
	}

	public void realizarSaque(float saque) {
		this.saldo -= saque;
	}

	public void realizarDeposito(float deposito) {
		this.saldo += deposito;
	}

	public void dadosConta() {
		System.out.println(String.format("Cliente: %s, número da conta: %s, número da agência: %s, saldo atual: %.2f",
				this.nome, this.numeroConta, this.numeroAgencia, this.saldo));
	}

}
