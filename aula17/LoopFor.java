package curso_java_basico.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			System.out.println("i tem valor: " + i);

		}
		
		
		
		for (int i = 5; i >= 0; i--) {

			System.out.println("i tem valor: " + i);

		}
		
		// for com mais de uma variável
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor: " + i + "e j tem valor: " + j);
		}
		
		// partes ausentes
		
		int i = 0;
		for (; i < 5;) {
			System.out.println("i tem valor: " + i);
			i++;
		}
		
		int count = 0;
		for (; count < 10 ;) {
			System.out.println("Valor de count " + count);
			count +=2;
		}
		
		
		for(int cont = 0; cont < 10; cont +=2) {
			System.out.println("valor de cont: " + cont);
		}
		
		// loop infinito for(;;);
		
		/*int soma = 0;
		 *  for(int i = 1; i < 5; soma += i++);
		 *  System.out.println("O valor da soma é " + soma);
		 */ 
		
		


	}

}
