package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {

		/*
		 * O Hipermercado Tabajara está com uma promoção de carnes que é imperdível.
		 * Confira: File Duplo R$ 4,90 por Kg R$ 5,80 por Kg o Alcatra R$ 5,90 por Kg R$
		 * 6,80 por Kg Picanha R$ 6,90 por Kg R$ 7,80 por Kg Para atender a todos os
		 * clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
		 * porém não há limites para a quantidade de carne por cliente. Se compra for
		 * feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o
		 * total a compra. Escreva um programa que peça o tipo e a quantidade de carne
		 * comprada pelo usuário e gere um cupom fiscal, contendo as informações da
		 * compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do
		 * desconto e valor a pagar.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Tipo de carne : ");
			System.out.println("1 - file duplo");
			System.out.println("2 - alcatra");
			System.out.println("3 - picanha");
			
			int tipo = scan.nextInt();
			
			System.out.println("Digite a quantidade(kg): ");
			double qtd = scan.nextDouble();
			
			double precoKg = 0;
			
			if(tipo == 1) {
				
				System.out.println(qtd + "Kg - file duplo");
				
				if(qtd < 5) {
					precoKg = 4.9;
				}else {
					precoKg = 5.8;
				}
			}else if(tipo == 2) {
				
				System.out.println(qtd + "Kg - alcatra");
				if(qtd < 5) {
					precoKg = 5.9;
				}else {
					precoKg = 6.8;
				}
			}else if(tipo == 3) {
				
				System.out.println(qtd + "Kg - picanha");
				if(qtd < 5) {
					precoKg = 6.9;
				}else {
					precoKg = 7.8;
			}

}
			double total = qtd * precoKg;
			System.out.println(qtd + "Kg * " + precoKg + " = " + total );
			System.out.println("Forma de pagamento será no cartão? digite 1 para sim:");
			int cartao = scan.nextInt();
			
			if(cartao == 1) {
				double desconto = (total / 100) * 5;
				System.out.println("Desconto de: " + desconto);
				System.out.println("Valor a pagar: " + (total - desconto));
			}else {
				System.out.println("Valor a pagar: " + total);
			}
		}
		
	}
	
}

