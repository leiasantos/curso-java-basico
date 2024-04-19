package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Altere o programa anterior permitindo ao usuário informar as populações e as
		 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			double populA;
			double populB;
			double taxaA;
			double taxaB;
			
			boolean valido = false;
			do {
				System.out.println("Entre com a população A:");
				populA = scan.nextDouble();
				
				if(populA > 0) {
					valido = true;
				} else {
					System.out.println("População A precisa ser maior que 0");
				}
			}while(!valido);
			
			valido = false;
			
			do {
				System.out.println("Entre com a população B:");
				populB = scan.nextDouble();
				
				if(populB > 0) {
					valido = true;
				}else {
					System.out.println("População B precisa ser maior que 0");
				}
			}while(!valido);
			
			valido = false;
			
			do {
				System.out.println("Entre com a taxa de crescimento da população A");
				taxaA = scan.nextDouble();
				
				if(taxaA > 0) {
					valido = true;
				}else {
					System.out.println("Taxa de crescimento A precisa ser maior que zero");
				}
				
			}while(!valido);
			
			valido = false;
			
			do {
				System.out.println("Entre com a taxa de crescimento da população B");
				taxaB = scan.nextDouble();
				
				if(taxaB > 0) {
					valido = true;
				}else {
					System.out.println("Taxa de crescimento B precisa ser maior que zero");
				}
				
			}while(!valido);
			
			
			int cont = 0;
			
			while(populA < populB) {
				populA += (populA/100) * taxaA;
				populB += (populB/100) * taxaB;
				cont++;
			}
			
			
			System.out.println("População A: " + populA);
			System.out.println("População B: " + populB);
			System.out.println("Quantidade de anos: " + cont + " anos");
		}

	}

	}


