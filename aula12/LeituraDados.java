package curso_java_basico.aula12;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o seu primeiro nome, idade, altura, peso, tem bichinho de estimação ");
			String primeiroNome = scan.next();
			int idade = scan.nextInt();
			float altura = scan.nextFloat();
			float peso = scan.nextFloat();
			boolean temPet = scan.nextBoolean();
			
			System.out.println("Você digitou os seguintes valores: ");
			System.out.println("Primeiro nome: " + primeiroNome);
			System.out.println("Idade: " + idade);
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
			System.out.println("Bichinho de estimação " + temPet);
		}
	}
		
	  
	}
	
	


