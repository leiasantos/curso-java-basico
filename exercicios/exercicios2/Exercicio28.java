package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que calcule o valor total investido por um colecionador em
		 * sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá
		 * informar a quantidade de CDs e o valor para em cada um.
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o número de CDS:");
			int cds = scan.nextInt();

			double preco;
			double soma = 0;

			for (int i = 1; i <= cds; i++) {
				System.out.println("Valor do CD " + i);
				preco = scan.nextDouble();

				soma += preco;

			}

			double media = soma / cds;
			System.out.println("Média gasta com cada CD: " + media);
		}

	}

}
