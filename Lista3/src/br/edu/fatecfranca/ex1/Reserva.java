package br.edu.fatecfranca.ex1;

import java.util.Date;

public class Reserva {

	private int codigo;
	private Date data;
	private Passageiro passageiro;
	private Voo voo;

	public Reserva() {
	}

	public Reserva(int codigo, Date data, Passageiro passageiro, Voo voo) {
		this.codigo = codigo;
		this.data = data;
		this.passageiro = passageiro;
		this.voo = voo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public String mostra() {
		return String.format("Código: %d, data: %tc, %nPassageiro: %s, %nVoo: %s", this.codigo, this.data,
				this.passageiro.mostra(), this.voo.mostra());
	}

}
