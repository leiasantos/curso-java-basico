package curso_java_basico.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");

	}

	public double obterAutonomia() {

		System.out.println("Método obterA;utonomia foi chamado.");

		return capacidadeCombustivel *this.consumoCombustivel;

	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km /this.consumoCombustivel ;
	}

	public double calcularCombustivel(double km) {

		return this.divideKMPorConsumoCombustivel(km);
	}

	
}
	

