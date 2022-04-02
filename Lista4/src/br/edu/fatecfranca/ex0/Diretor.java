package br.edu.fatecfranca.ex0;

public class Diretor extends Funcionario {

	private float valor;
	private String modelo;

	public Diretor() {
	}

	public Diretor(float valor, String modelo, int numero, String nome, float salario) {
		super(numero,nome,salario);
		this.valor = valor;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return String.format("Valor: %.2f, modelo: %s, " + super.toString() + ", salario final: %.2f", this.valor,
				this.modelo, this.calculaSalarioFinal());
	}

	@Override
	public float calculaSalarioFinal() {
		return this.salario + (5 * this.valor / 100);
	}

}
