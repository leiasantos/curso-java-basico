package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio24 {
	
	/*. Faça um Programa que leia três números
	 * e mostre-os em ordem decrescente
	 */

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número");
			int num1 = scan.nextInt();
			
			System.out.println("Digite o segundo número");
			int num2 = scan.nextInt();
			
			System.out.println("Digite o terceiro número");
			int num3 = scan.nextInt();
			
			
			if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
				System.out.println(num3 + " - " + num2 + " - " +num1 );
			}else if(num2 <= num1 && num2 <= num3 && num1 <= num3) {
				System.out.println(num3 + " - " + num1 + " - " + num2);
			}else if(num2 <= num1 && num2 <= num3 && num3 <= num1) {
				System.out.println("");
			}
		}
	}

}
