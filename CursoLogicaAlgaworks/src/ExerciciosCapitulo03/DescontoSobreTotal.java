package ExerciciosCapitulo03;

import java.util.Scanner;

/*
Crie um programa que vai receber do usu�rio o valor do produto e a quantidade do produto que se deseja. 
Com essas informa��es encontre o subtotal que ser� o valor do produto multiplicado pela quantidade.
Depois voc� vai precisar usar uma estrutura de decis�o.
Se a quantidade desejada do produto for maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10,
voc� N�O aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) 
voc� multiplica o subtotal pelo pr�prio percentual e divide tudo por 100.

Tendo o valor referente ao percentual de desconto, voc� vai retirar esse valor do subtotal. 
O que sobrar ser� o valor total final e dever� ser apresentado no console. 
 */

public class DescontoSobreTotal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Usu�rio entra com o valor e a quantidade do produto.
		System.out.print("Digite o valor do produto: R$ ");
		Double valor = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidade = scanner.nextInt();
		
		// Analisando se a compra ter� desconto ou n�o.
		Double desconto = 0.0;
		Boolean compraComDesconto = quantidade >= 10;
		
		if (compraComDesconto) {
			desconto = 10.0;
		}
		// Calculando valor final da compra:
		Double subtotal = quantidade * valor;
		Double valorDesconto = (subtotal * desconto) / 100;
		Double valorTotal = subtotal - valorDesconto;
		
		// Imprimindo resultado final para usu�rio:
		System.out.println("O valor final da compra � de R$ " + valorTotal);
		
		scanner.close();
		
	}

}
