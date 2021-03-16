package ExerciciosCapitulo03;

import java.util.Scanner;


/*
 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo.
 * Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome". 
 * Por último, você vai juntar o nome e o sobrenome em uma única impressão.
 */

public class NomeSobrenome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();

		System.out.println("Digite seu sobrenome:");
		String sobreNome = scanner.nextLine();

		System.out.println("Olá " + nome + " " + sobreNome + "!");

		scanner.close();
	}

}
