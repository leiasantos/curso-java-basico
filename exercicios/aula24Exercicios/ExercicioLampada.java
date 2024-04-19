package curso_java_basico.aula24Exercicios;

public class ExercicioLampada {

	public static void main(String[] args) {

		/*
		 * Escreva uma classe para representar uma lâmpada que está à venda em um
		 * supermercado.
		 * 
		 */
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";		
		
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.garantiaMeses);

	}

}
