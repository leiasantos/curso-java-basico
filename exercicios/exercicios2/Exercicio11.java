package curso_java_basico.exercicios2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		// Altere o programa anterior para mostrar no final a soma dos números.
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número");
			 int num1 = scan.nextInt();
			 
			 System.out.println("Digite o segundo número");
			 int num2 = scan.nextInt();
			 
			 int soma = 0;
			 for(int i = num1; 1 <= num2; i++) {
			     soma += i;
				 
				
			 }
			 
			 System.out.println("Soma: " + soma);
		}
		 
		
	
	}

}
