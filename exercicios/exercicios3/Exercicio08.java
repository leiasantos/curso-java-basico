package curso_java_basico.exercicios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		/*
		 * . Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos
		 * em A e B, ou seja: C[i] = A[i] * B[i].
		 */
		
		
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[10];
			int[] vetorB = new int[vetorA.length];
			int[] vetorC = new int[vetorA.length];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o valor do vetorA da posição:  " + i);
				vetorA[i] = scan.nextInt();

			}

			for (int i = 0; i < vetorB.length; i++) {
				System.out.println("Entre com o valor do vetorB da posição:  " + i);
				vetorB[i] = scan.nextInt();

			}

			for (int i = 0; i < vetorC.length; i++) {
				vetorC[i] = vetorA[i] * vetorB[i];
			}

			System.out.println("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i] + " ");
			}
			System.out.println();

			DecimalFormat df = new DecimalFormat("###,###.###");

			System.out.println("Vetor B = ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.println(df.format(vetorB[i]) + " ");
			}

			System.out.println("Vetor C = ");
			for (int i = 0; i < vetorC.length; i++) {
				System.out.println(df.format(vetorC[i]) + " ");
			}
		}

		System.out.println();
	}
	}

