package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		/*
		 * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e
		 * agora possui uma loja de conveniências. Faça um programa que implemente uma
		 * caixa registradora rudimentar. O programa deverá receber um número
		 * desconhecido de valores referentes aos preços das mercadorias. Um valor zero
		 * deve ser informado pelo operador para indicar o final da compra. O programa
		 * deve então mostrar o total da compra e perguntar o valor em dinheiro que o
		 * cliente forneceu, para então calcular e mostrar o valor do troco. Após esta
		 * operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
		 * compra. A saída deve ser conforme o exemplo abaixo: Lojas Tabajara Produto 1:
		 * R$ 2.20 Produto 2: R$ 5.80 Produto 3: R$ 0 Total: R$ 9.00 Dinheiro: R$ 20.00
		 * Troco: R$ 11.00 ...
		 */

		try (Scanner scan = new Scanner(System.in)) {
			boolean sair = false;
			String continuarCompra;
			int qtdProdutos;
			double preco;
			double total;
			String output;
			double valorPago;
			double troco;

			do {
				System.out.println("Deseja informar uma nova compra? S/N");
				continuarCompra = scan.next();

				if (continuarCompra.equalsIgnoreCase("S")) {

					output = "Lojas Tabajara\n";
					System.out.println("Quantidade de produtos da compra:");
					qtdProdutos = scan.nextInt();

					total = 0;

					for (int i = 1; i <= qtdProdutos; i++) {
						System.out.println("Informe preço do produto " + i);
						preco = scan.nextDouble();
						total += preco;
						output += "Produto" + i + " : R$ " + preco + "\n";
					}

					output += "Total: R$ " + total;

					System.out.println("Total: R$ " + total);

					System.out.println("Digite o valor pago:");
					valorPago = scan.nextDouble();

					output += "Dinheiro: R$ " + valorPago + "\n";

					troco = total - valorPago;

					output += "Troco: R$ " + troco;

					System.out.println(output);
				} else {
					sair = true;
				}

			} while (!false);
		}

	}

}
