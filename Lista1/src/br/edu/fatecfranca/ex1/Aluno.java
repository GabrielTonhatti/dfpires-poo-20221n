package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {

	int numeroAluno;
	String nome;
	int idade;
	float p1;
	float p2;

	public Aluno() {

	}

	public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
		this.numeroAluno = numeroAluno;
		this.nome = nome;
		this.idade = idade;
		this.p1 = p1;
		this.p2 = p2;
	}

	float notaFinal() {
		return (this.p1 + this.p2) / 2;
	}

	void dadosAluno() {
		JOptionPane.showMessageDialog(null,
				"Número do aluno: " + numeroAluno + ", nome: " + nome + ", idade: " + idade);
	}

	String passou() {
		return this.notaFinal() >= 6 ? "Aprovado!" : "Reprovado!";
	}

}
