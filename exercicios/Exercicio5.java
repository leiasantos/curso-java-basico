package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/* Faça um programa que converta metros 
		 *  para centímetros
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a quantidade de metros");
			double metros = scan.nextDouble();
			
			// 1m = 100cm
			double cm = metros * 100;
			
			System.out.println(metros + " m é igual a " + cm + "cm ");
		}
		

	}

}
