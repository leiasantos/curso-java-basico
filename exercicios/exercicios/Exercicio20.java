package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para a leitura de duas notas parciais de um aluno. O
		 * programa deve calcular a média alcançada por aluno e apresentar: o A mensagem
		 * "Aprovado", se a média alcançada for maior ou igual a sete. A mensagem
		 * "Reprovado", se a média for menor do que sete; A mensagem
		 * "Aprovado com Distinção", se a média for igual a dez.
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota");
			double nota1 = scan.nextDouble();

			System.out.println("Digite a segunda nota");
			double nota2 = scan.nextDouble();

			double media = (nota1 + nota2) / 2;

			if (media == 10) {
				System.out.println("Parabéns você foi aprovado com distinção");
			} else if (media >= 7) {
				System.out.println("Você foi aprovado");
			} else {
				System.out.println("Você foi reprovado");
			}
		}
	}

}
