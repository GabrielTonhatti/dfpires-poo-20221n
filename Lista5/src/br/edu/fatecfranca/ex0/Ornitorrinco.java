package br.edu.fatecfranca.ex0;

public class Ornitorrinco implements Ave, Mamifero {

	@Override
	public void darMamar() {
		System.out.println("Ornitorrinco mamando");
	}

	@Override
	public void criarPelo() {
		System.out.println("Ornitorrinco criando pelo");
	}
	
	@Override
	public void bicar() {
		System.out.println("Ornitorrinco bicando");		
	}

	@Override
	public void porOvos() {
		System.out.println("Ornitorrinco pondo ovos");		
	}

}
