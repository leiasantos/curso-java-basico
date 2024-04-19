package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicios32 {

	public static void main(String[] args) {
		
		/*.Faça um Programa que peça um número correspondente a um 
		 * determinado ano e em seguida informe se este ano é ou não bissexto.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um ano");
			
			int ano = scan.nextInt();
			
			if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0 )) {
				System.out.println("É um ano bissexto");
			}else {
				System.out.println("Não é um ano bissexto");
			}
		}
 
	}

}
