package curso_java_basico.exercicios2;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Supondo que a população de um país A seja da ordem de 80000 habitantes com
		 * uma taxa anual de crescimento de 3% e que a população de B seja 200000
		 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
		 * e escreva o número de anos necessários para que a população do país A
		 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
		 * 
		 */
		
		int populA = 80000;
		int populB = 200000;
		int cont = 0;
		
		while(populA < populB) {
			populA += (populA/100) * 3;
			populB += (populB/100) *1.5;
			cont++;
		}
		
		
		System.out.println("População A: " + populA);
		System.out.println("População B: " + populB);

		System.out.println("Quantidade de anos: " + cont + " anos");

	}

}
