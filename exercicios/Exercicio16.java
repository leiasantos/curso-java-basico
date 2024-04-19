package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que peça dois números e imprima o maior deles
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um primeiro número");
			int num1 = scan.nextInt();
			
			System.out.println("Digite um segundo número");
			int num2 = scan.nextInt();
			
			if(num1 > num2) {
				System.out.println("O num1 é maior: " + num1);
			}else {
				System.out.println("O num2 é maior: " + num2);
			}
		}
		

	}

}
