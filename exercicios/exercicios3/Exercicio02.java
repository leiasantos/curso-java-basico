package curso_java_basico.exercicios3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo
		 * e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] =
		 * A[i] * 2.
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[8];
			int[] vetorB = new int[vetorA.length];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = scan.nextInt();

				vetorB[i] = vetorA[i] * 2;
			}
			System.out.println("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i] + " ");
			}
			System.out.println();

			System.out.println("Vetor B = ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.println(vetorB[i] + " ");
			}
		}

		System.out.println();

	}

}
