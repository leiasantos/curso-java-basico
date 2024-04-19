package curso_java_basico.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.capacidadeCombustivel = 100;
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.consumoCombustivel = 100;
		
		System.out.println(van.capacidadeCombustivel);
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.consumoCombustivel);
		
		van.exibirAutonomia();
	
	}

}
