package br.edu.fatecfranca.ex2;

public class ItemCarrinho {

	private int codigo;
	private String descricao;
	private float valor;
	private int qtde;

	public ItemCarrinho() {

	}

	public ItemCarrinho(int codigo, String descricao, float valor, int qtde) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.qtde = qtde;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return String.format("codigo: %d, descricao: %s, valor: %.2f, quantidade: %d", this.codigo, this.descricao,
				this.valor, this.qtde);
	}

}
