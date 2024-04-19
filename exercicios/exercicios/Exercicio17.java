package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que peça um valor e mostre na tela se o valor é 
		 * positivo ou negativo.
		 */
         

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			int num = scan.nextInt();
			
			if (num >= 0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
			}
		}
		
	}

}
