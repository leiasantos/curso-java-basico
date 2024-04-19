package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
		 * primeiro número elevado ao segundo número. Não utilize a função de potência
		 * da linguagem.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a base");
			int base = scan.nextInt();
			
			System.out.println("Entre com a potência");
			int pote = scan.nextInt();
			
			int resultado = base;
			
			for(int i = 1; i < pote; i++) {
				resultado *= base;
			}
			
			System.out.println("Resultado: " + resultado);
		}
		
	}
}
