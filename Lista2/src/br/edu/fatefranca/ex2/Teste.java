package br.edu.fatefranca.ex2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Aluno aluno = new Aluno(123456, "Beltrano", 15, 8.7F, 5.6F);
		String resultado = aluno.notaFinal() >= 6.0 ? "Aprovado" : "Reprovado";
		aluno.dadosAluno();
		System.out.printf("O aluno %s foi %s!", aluno.getNome(), resultado);

		System.out.println("\n\nInforme o nome do aluno: ");
		String nome = input.nextLine();
		System.out.println("Informe o número do aluno: ");
		int numeroAluno = input.nextInt();
		System.out.println("Informe a idade do aluno: ");
		int idade = input.nextInt();
		System.out.println("Informe a primeira nota do aluno: ");
		float p1 = input.nextFloat();
		System.out.println("Informe a segunda nota do aluno: ");
		float p2 = input.nextFloat();
		Aluno aluno2 = new Aluno(numeroAluno, nome, idade, p1, p2);
		resultado = aluno2.notaFinal() >= 6.0 ? "Aprovado" : "Reprovado";
		aluno2.dadosAluno();
		System.out.printf("O aluno %s foi %s!", aluno.getNome(), resultado);

		input.close();
		
		/**
		 * Resposta letra D:
		 * A tentar acessar as variáveis de instância privadas da clase Aluno
		 * sem os métodos "get" e "set", vai exibir um erro de compilação na IDE
		 * pois como a variável é privada so pode ser acessada dentro da própria classe
		 * ou através de métodos de acesso como "get" e "set".
		 **/
	}

}
