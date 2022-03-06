package br.edu.fatefranca.ex1;

public class Teste {

	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		fulano.setNome("Fulano");
		fulano.setNumeroConta("123456-8");
		fulano.setNumeroAgencia("9876-5");
		fulano.dadosConta();
		fulano.realizarDeposito(2500.90F);
		fulano.dadosConta();
		fulano.realizarSaque(1500F);
		fulano.dadosConta();
		
		/**
		 * Resposta letra D:
		 * A tentar acessar as variáveis de instância privadas da clase Cliente
		 * sem os métodos "get" e "set", vai exibir um erro de compilação na IDE
		 * pois como a variável é privada so pode ser acessada dentro da própria classe
		 * ou através de métodos de acesso como "get" e "set".
		 **/
	}
	
}
