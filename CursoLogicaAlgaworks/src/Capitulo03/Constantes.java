package Capitulo03;

import java.util.Scanner;

public class Constantes {

	// Declarando qual a idade minima para tirar carteira
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Entrada de dados
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();

		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

		if (podeTirarCarteira) {
			System.out.println("Sim! pode tirar carteira");
		} else {
			System.out.println("Não! pode tirar carteira");
		}

		scanner.close();
	}

}
