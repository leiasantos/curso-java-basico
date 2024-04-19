package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça dois números 
		 * e imprima a soma
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro número: ");
			int num1 = scan.nextInt();
			
			System.out.println("Entre com o segundo número: ");
			int num2 = scan.nextInt();
			
			int resultado = num1 + num2 ;
			System.out.println("A soma dos números é: " + resultado);
		}
		
	}

}
