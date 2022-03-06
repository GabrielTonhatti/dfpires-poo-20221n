package br.edu.fatefranca.ex2;

public class Aluno {

	private int numeroAluno;
	private String nome;
	private int idade;
	private float p1;
	private float p2;

	public Aluno() {
	}

	public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
		this.setNumeroAluno(numeroAluno);
		this.setNome(nome);
		this.setIdade(idade);
		this.setP1(p1);
		this.setP2(p2);
	}

	public int getNumeroAluno() {
		return numeroAluno;
	}

	public void setNumeroAluno(int numeroAluno) {
		if (Integer.toString(numeroAluno).length() == 6) {
			this.numeroAluno = numeroAluno;
		} else {
			this.numeroAluno = 0;
			System.out.println("Número do aluno inválido! O número do aluno deve ter tamanho igual a 6!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0 && nome.length() <= 30) {
			this.nome = nome;
		} else {
			this.nome = "";
			System.out.println("Nome do aluno muito grande!");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			this.idade = 0;
			System.out.println("Idade do aluno inválida! Idade não pode ser negativa!");
		}
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		if (p1 > 0.0 && p1 < 10.0) {
			this.p1 = p1;
		} else {
			this.p1 = 0.0F;
			System.out.println("Nota do aluno inválida!");
		}
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		if (p2 > 0.0 && p2 < 10.0) {
			this.p2 = p2;
		} else {
			this.p2 = 0.0F;
			System.out.println("Nota do aluno inválida!");
		}
	}

	public float notaFinal() {
		return (this.p1 + this.p2) / 2;
	}

	public void dadosAluno() {
		System.out.println(
				String.format("Número do aluno: %s, nome: %s, idade: %d", this.numeroAluno, this.nome, this.idade));
	}

}
