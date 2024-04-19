package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça um número
		 * e então mostre a mensagem O número informado foi [número]
		 * 
		 */
		
	     try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um numero inteiro:");
			 int numero = scan.nextInt();
			 System.out.println("O numero informado foi: " + numero);
		}
		 
		
	}

}
