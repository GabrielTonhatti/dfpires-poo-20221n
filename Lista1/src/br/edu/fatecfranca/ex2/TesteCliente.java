package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		fulano.nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
		fulano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
		fulano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência: "));
		fulano.saldo = Float.parseFloat(
				JOptionPane.showInputDialog(String.format("Informe o primeiro depósito do cliente %s: ", fulano.nome)));
		fulano.dados();
		int resp = JOptionPane.showConfirmDialog(null, "Deseja sacar algum valor?");
		if (resp == JOptionPane.OK_OPTION)
			fulano.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja sacar: ")));

		fulano.dados();

		resp = JOptionPane.showConfirmDialog(null, "Deseja depositar algum valor?");
		if (resp == JOptionPane.OK_OPTION)
			fulano.realizarDeposito(
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja depositar: ")));

		fulano.dados();
		
		Cliente beltrano = new Cliente(1745, 41, "Beltrano", 875956);
		beltrano.dados();
		resp = JOptionPane.showConfirmDialog(null, "Deseja sacar algum valor?");
		if (resp == JOptionPane.OK_OPTION)
			beltrano.realizarSaque(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja sacar: ")));

		beltrano.dados();

		resp = JOptionPane.showConfirmDialog(null, "Deseja depositar algum valor?");
		if (resp == JOptionPane.OK_OPTION)
			beltrano.realizarDeposito(
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja depositar: ")));

		beltrano.dados();
	}

}
