package curso_java_basico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite sua idade");
			
			int idade = scan.nextInt();
			
			if (idade >= 18) {
				System.out.println("É maior de idade.");
			}else {
				System.out.println("Não é maior de idade.");
			}
			
			// outro exemplo
			
			System.out.println("Digite o preço do item");
			double valor = scan.nextDouble();
			
			if(valor <= 10) {
				System.out.println("Está barato, pode comprar");
			}else if (valor > 10 && valor < 15) {
				System.out.println("Você pode pedir um desconto");
				
			}else if( valor >= 15 && valor < 17) {
				System.out.println("Pesquise mais");
			}else {
				System.out.println("Muito caro!!");
			}
		}

	}

}
