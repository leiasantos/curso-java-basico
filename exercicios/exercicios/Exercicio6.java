package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		/*Faça um programa que peça o raio de um círculo
		 * calcule e mostre sua área
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Coloque o raio do Círculo");
			double raio = scan.nextDouble();
			
			double area = Math.PI * Math.pow (raio, 2);
			
			System.out.println("A área do círculo é: " + area);
		}

	}

}
