package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio23 {
	
	/*Faça um programa que pergunte o preço de três produtos 
	 *  e informe qual produto você  deve comprar,
	 *   sabendo que a decisão é sempre pelo mais barato.
	 * 
	 */

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com Primeiro preço : ");
			double preco1 = scan.nextDouble();
			
			System.out.println("Entre com Segundo preço : ");
			double preco2 = scan.nextDouble();
			
			System.out.println("Entre com Terceiro preço : ");
			double preco3 = scan.nextDouble();
			
			if(preco1 <= preco2 && preco1 <= preco3) {
				System.out.println("Compre o Primeiro produto");
			}else if (preco2 <= preco1 && preco2 <= preco3) {
				System.out.println("Compre o Segundo produto");
			}else if(preco3 <= preco1 && preco3 <= preco2) {
				System.out.println("Compre o Terceiro produto");
			}
		}
		
		
		
		
		
		
		
		
	}

}
