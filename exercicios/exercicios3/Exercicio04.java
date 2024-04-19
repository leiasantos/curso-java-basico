package curso_java_basico.exercicios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
		 * tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
		 * respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[15];
			double[] vetorB = new double[vetorA.length];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = scan.nextInt();

				vetorB[i] = Math.sqrt(vetorA[i]);

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
