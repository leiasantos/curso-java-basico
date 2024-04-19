package curso_java_basico.exercicios;

import java.util.Scanner;

public class CalculandoImc {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o seu peso: ");
			double peso = scan.nextDouble();
			
			System.out.println("Digite sua altura: ");
			double altura = scan.nextDouble();
			
			double imc;
			imc = peso / Math.pow(altura, 2);
			
			System.out.println("Seu imc é de : " + imc);
			
			if( imc < 18.5) {
				System.out.println("MAGREZA");
			}else {
				if( imc >= 18.5 || imc <=  24.9) {
					System.out.println("NORMAL");
				} else {
					if(imc >= 25.0 || imc <=  29.9 ) {
						System.out.println("SOBREPESO");	
					} else {
						if(imc >= 30.0 || imc <= 39.9) {
							System.out.println("OBESIDADE");
						} else{
							if(imc >= 40.0) {
								System.out.println("OBESIDADE GRAVE");
							}
						}
					}
				}
			}
		}
		
	}

}
