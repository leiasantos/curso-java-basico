package curso_java_basico.exercicios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
		 * elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i]
		 * * i.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[10];
			double[] vetorB = new double[vetorA.length];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = scan.nextInt();

				vetorB[i] = vetorA[i] * i;

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
		}
		System.out.println();
	}

	}


