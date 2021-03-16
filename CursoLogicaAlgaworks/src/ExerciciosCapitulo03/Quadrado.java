package ExerciciosCapitulo03;

import java.util.Scanner;

/* 
 * Exercicio para calcular o quadro de um numero: 
 * Leia um n�mero no console e depois fa�a o c�lculo do quadrado desse n�mero e exiba o resultado no console. 
 * Lembrando que o quadrado de um n�mero � calculado multiplicando-se o n�mero por ele mesmo. Por exemplo, 
 * para encontrar o quadrado de 2 � preciso multiplicar o 2 por 2, tendo como resultado o n�mero 4.
 */
public class Quadrado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um n�mero para calcular seu quadrado: ");
		Integer numero = scanner.nextInt();

		Integer quadrado = numero * numero;

		System.out.println("O valor do numero " + numero + " ao quadrado �: " + quadrado);

		scanner.close();
	}

}
