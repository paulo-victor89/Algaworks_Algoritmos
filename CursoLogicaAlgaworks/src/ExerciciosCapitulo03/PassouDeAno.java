package ExerciciosCapitulo03;

import java.util.Scanner;

/*  O seu programa deve receber a nota do aluno pelo console e depois voc� vai fazer uma opera��o l�gica para saber se a nota do aluno � maior que 70.
 *  O resultado dessa opera��o l�gica deve ser atribuido a uma vari�vel do tipo Boolean.
    Por �ltimo, voc� deve utilizar a vari�vel do tipo Boolean com a estrutura de decis�o if para imprimir, no console, 
    uma mensagem que vai dizer se o aluno passou ou n�o passou.
 */

public class PassouDeAno {

	
	static final Integer MEDIA_FINAL = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ol�! Informe seu nome: ");
		String nome = scanner.next();
		String sobreNome = scanner.next();

		System.out.println("Seja bem vindo! " + nome + " " + sobreNome + "!");
		System.out.println();

		System.out.println("Informe sua nota: ");
		Integer nota = scanner.nextInt();
		System.out.println();

		scanner.close();

		Boolean passouDeAno = nota >= MEDIA_FINAL;

		if (passouDeAno) {
			System.out.println("Parab�ns,  " + nome + " " + sobreNome + " ! Voc� passou de ano");
		} else {
			System.out.println("N�o " + nome + " " + sobreNome + " ! Infelizmente voc� n�o passou de ano");

		}

	}
}
