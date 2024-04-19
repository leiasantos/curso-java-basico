package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		/*Faça um Programa que leia três números e mostre o maior 
		 * e o menor deles.
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número");
			int num1 = scan.nextInt();
			
			System.out.println("Digite o segundo número");
			int num2 = scan.nextInt();
			
			System.out.println("Digite o terceiro número");
			int num3 = scan.nextInt();
			
			if(num1 >= num2 && num1 >= num3) {
				System.out.println("num1 é maior: " + num1);
			}else if (num2 >=num1 && num2 >= num3){
				System.out.println("num2 é maior: " + num2);
			}else if (num3 >= num1 && num3 >= num2) {
				System.out.println("num3 é maior: " + num3);
			}
			
			if(num1 <= num2 && num1 <= num3) {
				System.out.println("num1 é menor: " + num1);
			}else if (num2 <=num1 && num2 <= num3){
				System.out.println("num2 é menor: " + num2);
			}else if (num3 <= num1 && num3 <= num2) {
				System.out.println("num3 é menor: " + num3);
			}
		
	}

	}

}
