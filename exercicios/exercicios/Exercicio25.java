package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	/*
	 * Faça um Programa que pergunte em que turno você estuda Peça para digitar
	 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
	 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
	 */

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o turno que você estuda: ");
			String turno = scan.next();

			switch (turno) {
			case "m":
			case "M":
				System.out.println("\"Bom Dia/");
				break;
			case "v":
			case "V":
				System.out.println("\"Boa tarde");
				break;
			case "n":
			case "N":
				System.out.println("\"Boa noite");
				break;
			default:
				System.out.println("\"Valor inválido");
			}
		}

	}

}
