package curso_java_basico.aula26;



public class TesteCarro {

	public static void main(String[] args) {
		
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.capacidadeCombustivel);
		System.out.println(van.consumoCombustivel);
		System.out.println(van.numPassageiros);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é: " + autonomia);


	}

}
