package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private int codigo;
	private Date data;
	private List<Unidade> unidades;

	public Pedido() {
		this.unidades = new ArrayList<Unidade>();
	}

	public Pedido(int codigo, Date data, List<Unidade> unidades) {
		this.codigo = codigo;
		this.data = data;
		this.unidades = unidades;
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

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

}
