package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		/*
		 * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o
		 * fatorial várias vezes e limitando o fatorial a números inteiros positivos e
		 * menores que 16.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a quantidade de idade ");
			int idades = scan.nextInt();
			
			int idade;
			int soma = 0;
			
			for(int i = 0; i < idades; i++ ) {
				System.out.println("Digite com a idade de pessoas " + (i+1));
				idade = scan.nextInt();
				
				soma += idade;
			}
			
			double media = soma / idades;
			
			if(media >= 0 && media <= 25) {
				System.out.println("jovem");
			}else if (media >= 26 && media <= 60) {
				System.out.println("adulto");
			}else if(media > 60) {
				System.out.println("idoso");
			}
		}
		
	}

}
