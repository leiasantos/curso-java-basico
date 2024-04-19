package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		/* Faça um programa que pergunte quanto você ganha por hora 
		 * e o número de horas trabalhadas no mês.
		 * calcule e mostre o total do seu salário no referido mês.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Coloque o valor/hora");
			double valorHora = scan.nextDouble();
			
			System.out.println("Coloque a quantidade de horas trabalhadas no mês");
			double horas = scan.nextDouble();
			
			double salario = valorHora * horas;
			System.out.println("O salário será de: " + salario);
		}
		
		

	}

}
