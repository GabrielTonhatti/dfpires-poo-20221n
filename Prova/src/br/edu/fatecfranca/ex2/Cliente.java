package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String rg;
	private String nome;
	private List<Pedido> pedidos;

	public Cliente() {
		this.pedidos = new ArrayList<>();
	}

	public Cliente(String rg, String nome, List<Pedido> pedidos) {
		this.rg = rg;
		this.nome = nome;
		this.pedidos = pedidos;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
