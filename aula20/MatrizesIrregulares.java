package curso_java_basico.aula20;

import java.util.Scanner;

public class MatrizesIrregulares {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o número de pessoas que serão entrevistadas:");
			
			int numEntrevistados = scan.nextInt();
			
			String[][] nomesFilhos = new String[numEntrevistados][];
			
			for(int i = 0; i < nomesFilhos.length; i++ ) {
				System.out.println("Quantidade de filhos");
				int qtdFilhos = scan.nextInt();
				
				nomesFilhos[i] = new String[qtdFilhos];
				
				for(int j = 0;  j < nomesFilhos[i].length; j++) {
					System.out.println("Digite o nome do filho " + (j + 1) );
					
					nomesFilhos[i][j] = scan.next();
				}
			}
			
			for(int i = 0; i < nomesFilhos.length; i++) {
				System.out.println("Pessoa " + i + " têm " + nomesFilhos[i].length + " filhos ");
				for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);	
				}
			}
		}

	}

}
