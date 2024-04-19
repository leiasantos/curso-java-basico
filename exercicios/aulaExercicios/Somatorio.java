package curso_java_basico.aulaExercicios;

public class Somatorio {

	/*
	 * Escreva um método recursivo e estático que receba um número inteiro positivo
	 * N e calcule o somatório dos números de 1 a N
	 */
	
	
	
	// 5 = 5 + 4 + 3 + 2 + 1
	// 4 = 4 + 3 + 2 + 1
	// 3 = 3 + 2 + 1
	// 2 = 2 + 1
	// 1 = 1
	
	public static int somatorio(int num) {
		
	if(num == 1) {
		return 1;
	}
		
		
		return num + somatorio(num - 1);
	}

}
