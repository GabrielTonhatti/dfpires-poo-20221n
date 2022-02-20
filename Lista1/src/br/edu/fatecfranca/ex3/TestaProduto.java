package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TestaProduto {

	public static void main(String[] args) {
		Produto produto = new Produto(1, "Notebook Samsung Odyssey", 254, 8987.58F);
		produto.mostrar();
		int resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja comprar mais unidades do produto %s?", produto.descricao));
		if (resp == JOptionPane.OK_OPTION)
			produto.comprar(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ")));

		produto.mostrar();

		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja vender algumas unidades do produto %s?", produto.descricao));
		if (resp == JOptionPane.OK_OPTION)
			produto.vender(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja vender: ")));

		produto.mostrar();

		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja aumentar o preço do prudoto %s?", produto.descricao));
		if (resp == JOptionPane.OK_OPTION) produto.subir(Float.parseFloat(
				JOptionPane.showInputDialog(String.format("Digite o novo valor do produto %s: ", produto.descricao))));

		produto.mostrar();
		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja diminuir o preço do prudoto %s?", produto.descricao));
		if (resp == JOptionPane.OK_OPTION) produto.subir(Float.parseFloat(
				JOptionPane.showInputDialog(String.format("Digite o novo valor do produto %s: ", produto.descricao))));

		produto.mostrar();

		Produto produto2 = new Produto();
		produto2.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do novo produto: "));
		produto2.descricao = JOptionPane.showInputDialog("Digite a descrição do novo produto: ");
		produto2.preco = Float.parseFloat(
				JOptionPane.showInputDialog(String.format("Digite o preço do novo produto %s: ", produto2.descricao)));
		produto2.qtde = Integer.parseInt(JOptionPane.showInputDialog(
				String.format("Digite a quantidade disponível em estoque do novo produto %s: ", produto2.descricao)));

		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja comprar mais unidades do produto %s?", produto2.descricao));
		if (resp == JOptionPane.OK_OPTION)
			produto2.comprar(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ")));

		produto2.mostrar();

		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja vender algumas unidades do produto %s?", produto2.descricao));
		if (resp == JOptionPane.OK_OPTION)
			produto2.vender(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que deseja vender: ")));

		produto2.mostrar();

		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja aumentar o preço do prudoto %s?", produto2.descricao));
		if (resp == JOptionPane.OK_OPTION) produto2.subir(Float.parseFloat(
				JOptionPane.showInputDialog(String.format("Digite o novo valor do produto %s: ", produto2.descricao))));

		produto2.mostrar();
		resp = JOptionPane.showConfirmDialog(null,
				String.format("Deseja diminuir o preço do prudoto %s?", produto2.descricao));
		if (resp == JOptionPane.OK_OPTION) produto2.subir(Float.parseFloat(
				JOptionPane.showInputDialog(String.format("Digite o novo valor do produto %s: ", produto2.descricao))));

		produto2.mostrar();

	}

}
