package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class TestaRio {

	public static void main(String[] args) {
		Rio rio = new Rio("Amazonas", 250.58F, false);
		rio.mostrar();

		int res = JOptionPane.showConfirmDialog(null, "Está chovendo?");
		if (res == JOptionPane.OK_OPTION) {
			rio.chover(Float.parseFloat(JOptionPane.showInputDialog("Digite quanto que o rio aumentou: ")));
		}
		rio.mostrar();

		res = JOptionPane.showConfirmDialog(null, "Está ensolarado?");
		if (res == JOptionPane.OK_OPTION) {
			rio.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Digite quanto que o rio diminuiu: ")));
		}
		rio.mostrar();

		res = JOptionPane.showConfirmDialog(null, "O rio está sujo?");
		if (res == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "Limpando o rio...");
			rio.limpar();
		}
		rio.mostrar();

		res = JOptionPane.showConfirmDialog(null, "Estão sujando o rio?");
		if (res == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "O rio está sujo!!!");
			rio.sujar();
		}
		rio.mostrar();
		
		
		Rio rio2 = new Rio();
		rio2.nome = JOptionPane.showInputDialog("Informe o nome do rio: ");
		rio2.nivel = Float.parseFloat(JOptionPane.showInputDialog("Digite o nível do rio: "));
		res = JOptionPane.showConfirmDialog(null, "O rio está sujo?");
		rio2.poluido = res == JOptionPane.OK_OPTION;
		rio2.mostrar();
		
		res = JOptionPane.showConfirmDialog(null, "Está chovendo?");
		if (res == JOptionPane.OK_OPTION) {
			rio2.chover(Float.parseFloat(JOptionPane.showInputDialog("Digite quanto que o rio aumentou: ")));
		}
		rio2.mostrar();

		res = JOptionPane.showConfirmDialog(null, "Está ensolarado?");
		if (res == JOptionPane.OK_OPTION) {
			rio2.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Digite quanto que o rio diminuiu: ")));
		}
		rio2.mostrar();

		res = JOptionPane.showConfirmDialog(null, "O rio está sujo?");
		if (res == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "Limpando o rio2...");
			rio2.limpar();
		}
		rio2.mostrar();

		res = JOptionPane.showConfirmDialog(null, "Estão sujando o rio?");
		if (res == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "O rio está sujo!!!");
			rio2.sujar();
		}
		rio2.mostrar();
	}

}
