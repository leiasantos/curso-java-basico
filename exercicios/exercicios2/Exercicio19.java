package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		//Altere o programa anterior para que ele aceite apenas números entre 0
		//e 1000.
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o número de notas:");
			int notas = scan.nextInt();
			
			double soma = 0;
			double media;
			double nota;
			
			for(int i = 0; i < notas; i++) {
				System.out.println("Entre com a nota " + (i + 1));
				nota = scan.nextDouble();
				
				soma += nota;
			}
			
			media = soma / notas;
			
			System.out.println("Soma: " + soma);
			System.out.println("Média: " + media);
		}

	}

}
