package Capitulo03;

import java.util.Scanner;

public class IntroducaoVariaveis {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorProdutoSemFrete = valorProduto;
		
		Double valorProdutoComFrete = valorProduto + 2 ;
		
		System.out.println("Valor do produto sem frete: R$ " + valorProdutoSemFrete);
		System.out.println("Valor do produto com frete: R$ " + valorProdutoComFrete);
		
		scanner.close();
	}

}
