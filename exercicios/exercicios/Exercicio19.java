package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite uma letra: ");
			String letra = scan.next();

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
			}
		}
		
		
	/*	try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite uma letra: ");
			String letras = scan.next();

			
			if (letras.equalsIgnoreCase("a") || letras.equalsIgnoreCase("e") ||
					letras.equalsIgnoreCase("i") || letras.equalsIgnoreCase("o") ||
					letras.equalsIgnoreCase("u")) {
				System.out.println("Vogal");	
			}else {
				System.out.println("Consoante");
			}
		}*/

	}

}
