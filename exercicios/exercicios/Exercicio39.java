package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {

		/*
		 * .Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual
		 * operação ele deseja realizar. O resultado da operação deve ser acompanhado de
		 * uma frase que diga se o número é: . par ou ímpar; a. positivo ou negativo; b.
		 * inteiro ou decimal.
		 * 
		 */

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número");
			int num1 = scan.nextInt();

			System.out.println("Digite o segundo número");
			int num2 = scan.nextInt();

			System.out.println("Entre com a operação(+ - / * ):");
			String operacao = scan.next();

			double resultado = 0;
			boolean valida = true;

			switch (operacao) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			default:
				System.out.println("Operação inválida");
				valida = false;
				break;
			}
			
			if(valida) {
				
				System.out.println("Resultado: " + resultado);
				if(resultado >= 0) {
					System.out.println("Resultado positivo");
				}else {
					System.out.println("Resultado negativo");
				}
				if(resultado % 2 == 0 ) {
					System.out.println("Resultado par");
				}else {
					System.out.println("Resultado impar");
				}
			}
		}

	}

}
