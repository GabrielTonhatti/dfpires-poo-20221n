package br.edu.fatecfranca.ex0;

public class Assistente extends Funcionario {

	private float bonus;

	public Assistente() {

	}

	public Assistente(float bonus, int numero, String nome, float salario) {
		super(numero,nome,salario);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return String.format("Bonus: %.2f, " + super.toString(), this.bonus);
	}

}
