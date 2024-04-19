package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		try (/*
				 * .Faça um programa que receba dois números inteiros e gere os números inteiros
				 * que estão no intervalo compreendido por eles.
				 */
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número");
			 int num1 = scan.nextInt();
			 
			 System.out.println("Digite o segundo número");
			 int num2 = scan.nextInt();
			 
			 for(int i = num1; 1 <= num2; i++) {
			 
				 System.out.println(i);
				
			 }
			 
			
		}
		 
		 
	}
}
