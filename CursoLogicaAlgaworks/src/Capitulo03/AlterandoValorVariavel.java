package Capitulo03;

import java.util.Scanner;

/* 
 * Para esse algoritmo e necessário alterar o valor da variavel, e acrescentando um valor, caso seja escolhido o tipo de pagamento a prazo
 * 
 */

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = à prazo]: ");
		Integer tipoPagamento = scanner.nextInt();

		Boolean pagamentoAVista = tipoPagamento.equals(1);

		Double juros = 0.0;
		if (!pagamentoAVista) {// negando o tipo de pagamento a vista
			juros = 10.0;
		}

		Double acrescimo = valorProduto * juros / 100;

		Double valorTotal = acrescimo + valorProduto;

		System.out.println("Valor total: " + valorTotal);
		scanner.close();
	}

}
