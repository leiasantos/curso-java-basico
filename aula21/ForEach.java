package curso_java_basico.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for(int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}
		
		System.out.println("Usando o for each");
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		
	}
	
	

}
