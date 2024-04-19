package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que peça um número inteiro e determine se ele é par ou
		 * impar. Dica: utilize o operador módulo (resto da divisão).
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("par");
			}else {
				System.out.println("impar");
			}
		}
	}

}
