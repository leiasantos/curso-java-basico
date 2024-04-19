package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que, dado um conjunto de N números, determine o menor valor,
		 * o maior valor e a soma dos valores.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			int num = scan.nextInt();
			
			boolean primo = true;
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("Não é um número primo");
					primo = false;
				}
			}
			
			if(primo) {
				System.out.println("É um número primo");
			}
		}
	}

}
