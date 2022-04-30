package br.edu.fatecfranca.ex3;

public class Apto extends Imovel {

	private int numero;

	public Apto() {
		super();
	}

	public Apto(int numero, String endereco) {
		super(endereco);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return String.format("Apto(Numero: %s ", this.numero) + super.toString();
	}

}
