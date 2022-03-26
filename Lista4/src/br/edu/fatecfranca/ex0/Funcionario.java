package br.edu.fatecfranca.ex0;

public class Funcionario {

	protected int numero;
	protected String nome;
	protected float salario;

	public Funcionario() {
	}

	public Funcionario(int numero, String nome, float salario) {
		this.numero = numero;
		this.nome = nome;
		this.salario = salario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return String.format("Número: %d, nome: %s, salario: %.2f", this.numero, this.nome, this.salario);
	}

}
