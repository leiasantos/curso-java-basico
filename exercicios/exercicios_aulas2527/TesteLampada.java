package curso_java_basico.exercicios_aulas2527;

public class TesteLampada {

	public static void main(String[] args) {

		/*
		 * Escreva uma classe para representar uma lâmpada. Desenvolva métodos para
		 * ligar, desligar a lampada.
		 */
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
	

	}

}
