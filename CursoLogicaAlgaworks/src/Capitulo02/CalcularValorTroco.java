package Capitulo02;
import java.util.Scanner;

/*
 * Aqui sera desenvolvido um algortimo que vai auxiliar no controle de um caixa, como calcular o valor que deve ser dado de troco, de acordo 
 * com o valor do produto.
 */

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		Double valorProduto = scanner.nextDouble();// realiza a leitura do valor digitado pelo usuario
		
		System.out.print("Digite quantidade passada pelo cliente: R$ ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		
		System.out.println("Valor do troco: R$ " + resultado);
		
		scanner.close();
	
	}
}
