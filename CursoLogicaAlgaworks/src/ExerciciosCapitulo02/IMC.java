package ExerciciosCapitulo02;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Esse exercicio foi realizado com o proposito de calcular o IMC. 
 * Onde devem ser digitados peso e altura e retornar o valor do imc.*/

public class IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("C�LCULO DO �NDECE DE MASSA CORPORAL (IMC) "+"\n");

		System.out.print("Digite o seu peso: ");
		Double peso = scanner.nextDouble();// realiza a leitura do valor digitado pelo usuario

		System.out.print("Digite sua altura: ");
		Double altura = scanner.nextDouble();

		Double imc = peso / (altura * altura);
		
        System.out.println("Seu imc e = " + new DecimalFormat("#,##0.00").format(imc) );


		scanner.close();

	}
}