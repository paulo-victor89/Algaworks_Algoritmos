package ExerciciosCapitulo03;

import java.util.Scanner;


/*
 * Crie um programa que l�, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo.
 * Para isso, voc� vai precisar de duas vari�veis: a primeira voc� pode chamar de "nome" e a segunda de "sobrenome". 
 * Por �ltimo, voc� vai juntar o nome e o sobrenome em uma �nica impress�o.
 */

public class NomeSobrenome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();

		System.out.println("Digite seu sobrenome:");
		String sobreNome = scanner.nextLine();

		System.out.println("Ol� " + nome + " " + sobreNome + "!");

		scanner.close();
	}

}
