package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

		try (/*
				 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
				 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
				 * um triângulo, se o mesmo é: equilátero, isósceles ou escaleno Dicas: Três
				 * lados formam um triângulo quando a soma de quaisquer dois lados for maior que
				 * o terceiro; Triângulo Equilátero: três lados iguais; Triângulo Isósceles:
				 * quaisquer dois lados iguais; Triângulo Escaleno: três lados diferentes;
				 */
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o lado 1:");
			int lado1 = scan.nextInt();

			System.out.println("Digite o lado 2:");
			int lado2 = scan.nextInt();

			System.out.println("Digite o lado 3:");
			int lado3 = scan.nextInt();

			if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
				if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
					System.out.println("É um Triângulo Equilátero");
				} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
					System.out.println("É um Triângulo Escaleno");
				} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("É um Triângulo Isósceles");
				}

			} else {
				System.out.println("Não é um Triângulo");
			}
		}

	}

}
