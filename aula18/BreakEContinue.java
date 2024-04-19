package curso_java_basico.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			int num = scan.nextInt();
			
			System.out.println("Entre com um limite");
			int max = scan.nextInt();
			
			
			for(int i=num; i <= max; i++) {
			System.out.println(i);
				if(i % 7 == 0 ) {
			System.out.println("O valor de i é: " + i);
					break;
				}
			}
		}
		
	}

}
