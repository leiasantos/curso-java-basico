package curso_java_basico.exercicios3;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * defina e escreva a soma de todos os elementos armazenados neste vetor.
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[10];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o valor da posição " + i);
				vetorA[i] = scan.nextInt();
			}

			int soma = 0;
			for (int i = 0; i < vetorA.length; i++) {
				soma += vetorA[i];
			}

			System.out.println("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i] + " ");
			}
			System.out.println();
			System.out.println("Soma: " + soma);
		}

	}

}
