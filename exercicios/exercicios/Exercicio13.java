package curso_java_basico.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/*Faça um programa que pergunte quanto você ganha por hora
		 * e o número de horas trabalhadas no mês.
		 * Clcule e msotre o total do seu salário no referido mês, sabendo-se 
		 * que são descontados 11% para o imposto de Renda, 8% para o INSS 
		 * e 5% para o sindicato, faça um programa que nos dê:
		 * a. salario bruto
		 * b. quanto pagou ao INSS
		 * c. salário líquido
		 * d. calcule os descontos e o salário líquido, conforme 
		 * a tabela a baixo:
		 * + salario bruto: R$ - IR(11%) : R$ - INSS(8%) : 
		 * R$ - Sindicato (5%) : R$ = Salário Líquido : R$
		 * 
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor/hora");
			double valorHora = scan.nextDouble();
			
			System.out.println("Digite as horas trabalhadas nomes:");
			double horas = scan.nextDouble();
			
			double salarioBruto = valorHora * horas;
			double inss = (salarioBruto / 100) * 8;
			double sindicato = (salarioBruto / 100) * 5 ;
			double impostoDeRenda = (salarioBruto / 100) *11;
			double totalDescontos = inss + sindicato + impostoDeRenda;
			double salarioLiquido = salarioBruto - totalDescontos;
			
			
			System.out.println("Salário Bruto: " + salarioBruto);
			System.out.println("INSS: " + inss);
			System.out.println("Sindicato: " + sindicato);
			System.out.println("Imposto de Renda: " + impostoDeRenda);
			System.out.println("Total de descontos: " + totalDescontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		}
		
		
		
			
		
		
	
		 
	}

}
