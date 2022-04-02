package br.edu.fatecfranca.ex0;

public class Teste {

	public static void main(String[] args) {
		Assistente as1 = new Assistente(1000, 100, "Fulano", 2000);
		Gerente ge1 = new Gerente(20, 101, "Beltrano", 4000);
		Diretor di1 = new Diretor(5000, "Onix", 102, "Citrano", 6000);

		mostra(as1);
		mostra(ge1);
		mostra(di1);
	}

	public static void mostra(Funcionario x) {
		System.out.println(x.toString());
	}
}
