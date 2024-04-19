package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		/* Faça um programa que calcule a área de um quadrado,
		 * em seguida mostre o dobro desta área para o usuário
		 *
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Colocque o tamanho do lado do quadrado");
			double lado = scan.nextDouble();
			
			// lado * lado
			
			double area = Math.pow (lado, 2);
			
			System.out.println("A área do quadrado é: " + area);
			System.out.println("O dobro da área do quadrado é: " + (area * 2));
		}

	}

}
