package br.edu.fatecfranca.ex3;

public abstract class Imovel {

	protected String endereco;

	public Imovel() {

	}

	public Imovel(String endereco) {
		super();
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return String.format("Endereço: %s", this.endereco);
	}

}
