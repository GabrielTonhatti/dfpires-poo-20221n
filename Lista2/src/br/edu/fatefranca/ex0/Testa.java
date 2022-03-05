package br.edu.fatefranca.ex0;

public class Testa {

	public static void main(String[] args) {
		Niver obj = new Niver();
		obj.setDia(3);
		obj.setDia(80);
		obj.setDia(-3);
		obj.setMes("Janeiro");
		obj.setMes("Outono");
		obj.setMes("Fevereiro");
		
		System.out.println("Dia: " + obj.getDia() + ", Mês: " + obj.getMes());
		
		Niver obj2 = new Niver(7, "Janeiro");
		Niver obj3 = new Niver(38, "Verão");
	
	}
	
}
