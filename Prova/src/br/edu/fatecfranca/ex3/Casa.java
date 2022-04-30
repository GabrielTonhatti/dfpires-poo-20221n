package br.edu.fatecfranca.ex3;

public class Casa extends Imovel {

	private float quintal;

	public Casa() {
		super();
	}

	public Casa(float quintal, String endereco) {
		super(endereco);
		this.quintal = quintal;
	}

	public float getQuintal() {
		return quintal;
	}

	public void setQuintal(float quintal) {
		this.quintal = quintal;
	}

	@Override
	public String toString() {
		return String.format("Casa(Quintal: %s ", this.quintal) + super.toString();
	}

}
