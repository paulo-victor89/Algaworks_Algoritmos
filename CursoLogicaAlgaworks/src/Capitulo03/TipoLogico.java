package Capitulo03;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);

		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa: " + variavelFalsa);

		System.out.println("-----------------------------------------------");

		/* Valida��o para verificar a maioridade e possibilidade para tirar a cnh */

		Integer idade = 17;

		Boolean podeTirarCnh = idade >= 18;

		// System.out.println("Pode tirar a CNH ? "+ podeTirarCnh);

		if (podeTirarCnh) {
			System.out.println("Sim! Ela(e) pode tirar CNH");
		} else {
			System.out.println("N�o! Ela(e) n�o pode tirar CNH");

		}

	}

}
