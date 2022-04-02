package br.edu.fatecfranca.ex0;

public class Gerente extends Funcionario {

	private float comissao;

	public Gerente() {

	}

	public Gerente(float comissao, int numero, String nome, float salario) {
		super(numero,nome,salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return String.format("Comissão: %.2f, " + super.toString() + ", salario final: %.2f", this.comissao,
				this.calculaSalarioFinal());
	}

	@Override
	public float calculaSalarioFinal() {
		return this.salario + (this.salario * this.comissao / 100);
	}

}
