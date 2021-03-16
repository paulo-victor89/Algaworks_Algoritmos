package ExerciciosCapitulo03;

import java.util.Scanner;

/*
Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. 
Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
Depois você vai precisar usar uma estrutura de decisão.
Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10,
você NÃO aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) 
você multiplica o subtotal pelo próprio percentual e divide tudo por 100.

Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. 
O que sobrar será o valor total final e deverá ser apresentado no console. 
 */

public class DescontoSobreTotal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Usuário entra com o valor e a quantidade do produto.
		System.out.print("Digite o valor do produto: R$ ");
		Double valor = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidade = scanner.nextInt();
		
		// Analisando se a compra terá desconto ou não.
		Double desconto = 0.0;
		Boolean compraComDesconto = quantidade >= 10;
		
		if (compraComDesconto) {
			desconto = 10.0;
		}
		// Calculando valor final da compra:
		Double subtotal = quantidade * valor;
		Double valorDesconto = (subtotal * desconto) / 100;
		Double valorTotal = subtotal - valorDesconto;
		
		// Imprimindo resultado final para usuário:
		System.out.println("O valor final da compra é de R$ " + valorTotal);
		
		scanner.close();
		
	}

}
