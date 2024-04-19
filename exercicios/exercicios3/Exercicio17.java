package curso_java_basico.exercicios3;

import java.util.Scanner;

public class Exercicio17 {

	/*
	 * 7.Ler um vetor A com 10 elementos inteiros correspondentes as idades de um
	 * grupo de pessoas. Escreva um programa que determine e escreva a quantidade de
	 * pessoas que possuem idade superior a 35 anos.
	 */
	
	public static void main(String [] args) {
		
		 try (Scanner scan = new Scanner(System.in)) {
			int[] vetorA = new int [10];
			 
			 for(int i = 0; i < vetorA.length; i++) {
				 System.out.println("Entre conm a idade da pessoa " + (i+1));
				 vetorA[i] = scan.nextInt();
			 }
		}
	}
}
