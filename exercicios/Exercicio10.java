package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*Faça um programa que peça a temperatura em Celsius,
		 * transforme e mostre em graus Farenheit
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a temperatura em Celsius");
			double c = scan.nextDouble();
			
			double f = (c * 1.8) + 32 ;
			
			System.out.println("A temperatura " + c + "C é igual a " + f + " F");
		}
		
		
		

	}

}
