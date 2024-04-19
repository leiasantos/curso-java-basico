package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		/*
		 * .O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
		 * programa que leia as um conjunto indeterminado de temperaturas, e informe ao
		 * final a menor e a maior temperaturas informadas, bem como a média das
		 * temperaturas.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Quantidade de Temperatura");
			int qtdTemperatura = scan.nextInt();
			
			double temperatura;
			double soma = 0;
			double menor = Double.MAX_VALUE;
			double maior = Double.MIN_VALUE;
			
			for(int i = 1; i <= qtdTemperatura; i++) {
				
				System.out.println("Entre com a temperatura " + 1);
				temperatura = scan.nextDouble();
				
				soma += temperatura;
				
				if(temperatura > maior) {
					maior = temperatura;
				}
				
				if(temperatura < menor) {
					menor = temperatura;
				}
				
			}
			
			System.out.println("Média: " + (soma / qtdTemperatura));
			System.out.println("Menor temperatura: " + menor);
			System.out.println("Maior temperatura: " + maior);
		}
		
		

	}

}
