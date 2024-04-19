package curso_java_basico.aula30;

public class Carro {
	

	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	

	public Carro(String marca, String modelo, int numPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro() {
	
	}
	
	
	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
	
		this(marca,modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
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
