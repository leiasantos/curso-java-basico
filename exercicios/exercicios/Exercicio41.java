package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {

		/*
		 * Um posto está vendendo combustíveis com a seguinte tabela de descontos: .
		 * Álcool: a. até 20 litros, desconto de 3% por litro b. acima de 20 litros,
		 * desconto de 5% por litro Gasolina: c. até 20 litros, desconto de 4% por litro
		 * d. acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia
		 * o número de litros vendidos, o tipo de combustível (codificado da seguinte
		 * forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo
		 * cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do
		 * litro do álcool é R$ 1,90.
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a qauntidade de litros vendidos");
			double litros = scan.nextDouble();
			
			System.out.println("Digite o tipo de combustivel");
			String tipo = scan.next();
			
			double precoGas = 2.5;
			double precoAlc = 1.9;
			int desconto = 0;
			double total = 0;
			double totalDesconto = 0;
			
			if(tipo.equalsIgnoreCase("a")) {
				if(litros <= 20) {
					desconto = 3;
				}else {
					desconto = 5;
				}
				
				total = litros * precoAlc;
				
			}else if (tipo.equalsIgnoreCase("g")) {
				if(litros <= 20) {
					desconto = 4;
				}else {
					desconto = 6;
				}
				
				total = litros * precoGas;
			}
			
			totalDesconto = (total / 100) * desconto;
			
			double precoAPagar = total - totalDesconto;
			
			System.out.println("Valor a ser pago: " + precoAPagar);
		}

	}

}
