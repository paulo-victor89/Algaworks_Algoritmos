package Capitulo03;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobreNome = scanner.nextLine();

		System.out.println("Ol� " + nome + " "+ sobreNome +"!");
		
		scanner.close();
	}
}
