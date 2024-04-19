package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que calcule as raízes de uma equação do segundo grau, na
		 * forma ax2 + bx + c. O programa deverá pedir os valores de a,b e c e fazer as
		 * consistências, informando ao usuário nas seguintes situações: a. Se o usuário
		 * informar o valor de A igual a zero, a equação não é do segundo grau e o
		 * programa não deve fazer pedir os demai valores, sendo encerrado; b. Se o
		 * delta calculado for negativo, a equação não possui raizes reais. Informe ao
		 * usuário e encerre o programa; c. Se o delta calculado for igual a zero a
		 * equação possui apenas uma raiz real; informe-a ao usuário; d. Se o delta for
		 * positivo, a equação possui duas raiz reais; informe-as ao usuário;
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor a: ");
			int a = scan.nextInt();

			if (a == 0) {
				System.out.println("\"Não é uma esqução de segundo grau \" ");
			} else {

				System.out.println("Digite o valor b: ");
				int b = scan.nextInt();

				System.out.println("Digite o valor c: ");
				int c = scan.nextInt();

				double delta = (b * b) - (4 * a * c);
				if (delta < 0) {
					System.out.println("delta negativo");
				} else {
					
					System.out.println("delta: " + delta);
					
					double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
					double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

					System.out.println("x1 = " + x1);
					System.out.println("x2 = " + x2);

				}
			}
		}

	}

}
