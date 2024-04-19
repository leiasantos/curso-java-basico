package curso_java_basico.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe Carro foi instanciada");
	}

	void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");

	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");

		return capacidadeCombustivel * consumoCombustivel;

	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
