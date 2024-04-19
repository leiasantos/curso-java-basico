package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		/*
		 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
		 * Faça um programa capaz de gerar a série até o n−ésimo termo.
		 * 
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o n-ésimo termo da série de fibonacci:");
			int n = scan.nextInt();
			
			int primeiro = 1;
			int segundo = 1;
			int proximo;
			
			for(int i = 3; i <= n; i++) {
				
				proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;
				
				System.out.println(proximo);
				
			}
		}
		

	}

}
