package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		/*
		 * Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma
		 * lista dos números primos existentes entre 1 e um número inteiro informado
		 * pelo usuário.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			int num = scan.nextInt();
			
			for(int i = 1; i <= num; i++) {
				boolean primo = true;
				
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						primo = false;
					}
				}
				
				if(primo) {
					System.out.println(i);
				}
			}
		}
		
		

	}

}
