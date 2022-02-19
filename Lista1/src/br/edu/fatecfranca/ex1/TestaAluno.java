package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do(a) aluno(a): "));
		aluno.nome = JOptionPane.showInputDialog("Digite o nome do(a) aluno(a): ");
		aluno.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) aluno(a): "));
		aluno.p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova 1 do(a) aluno(a): "));
		aluno.p2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova 2 do(a) aluno(a): "));
		aluno.dadosAluno();
		String resultado = aluno.passou();
		JOptionPane.showMessageDialog(null, resultado);
	}

}
