package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		/*
		 * 
		 * Faça um programa que peça um número inteiro e determine se ele é ou não um
		 * número primo. Um número primo é aquele que é divisível somente por ele mesmo
		 * e por 1.
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o número de turmas");
			int numTurmas = scan.nextInt();

			int numAlunos;
			int soma = 0;
			boolean invalido = true;

			for (int i = 1; i <= numTurmas; i++) {

				do {
					System.out.println("Número de alunos da turma " + i);
					numAlunos = scan.nextInt();

					if (numAlunos <= 40) {
						invalido = false;
					}else {
						System.out.println("Número de alunos inválido");
					}

				} while (invalido);
				
				soma += numAlunos;
			}
			
			double media = soma / numTurmas;
			
			System.out.println("Média: " + media);
		}
	}
}