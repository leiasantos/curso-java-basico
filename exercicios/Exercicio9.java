package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	    
		/*Faça um programa que peça a temperatura em graus Fahrenheit,
		 * transforme e mostre a temperatura em graus Celsius
		 * C =(5 * (F-32) / 9).
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a temperatura em Fahrenheit");
			double f = scan.nextDouble();
			
			double c = (5 * (f -32) / 9);
			System.out.println("A temperatura " + f + "F é igual a " + c + " C");
		}
				
				
		
		
	}

}
