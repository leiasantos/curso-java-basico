package curso_java_basico.exercicios3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do
		 * respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int[15];
			int[] vetorB = new int[vetorA.length];
			
			for(int i=0; i <vetorA.length; i++) {
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = scan.nextInt();
				
				vetorB[i] = vetorA[i] * vetorA[i];
			}
			
			System.out.println("Vetor A = ");
			for(int i= 0; i < vetorA.length; i++ ) {
				System.out.println(vetorA[i] + " ");
			}
			System.out.println();
			
			System.out.println("Vetor B = ");
			for(int i= 0; i < vetorB.length; i++ ) {
				System.out.println(vetorB[i] + " ");
			}
		}
		System.out.println();
	}

}
