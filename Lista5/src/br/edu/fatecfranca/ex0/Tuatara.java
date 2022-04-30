package br.edu.fatecfranca.ex0;

public class Tuatara implements Reptil, Mamifero {

	@Override
	public void criarEscama() {
		System.out.println("Tuatara criando escamas");
	}

	@Override
	public void darMamar() {
		System.out.println("Tuatara dando mama");
	}

	@Override
	public void criarPelo() {
		System.out.println("Tuatara criando pelos");
	}

	@Override
	public void porOvos() {
		System.out.println("Tuatara pondo ovos");
	}

}
