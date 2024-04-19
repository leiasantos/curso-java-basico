package curso_java_basico.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 29.2;
		double tempDia003 = 25.3;
		double tempDia004 = 38;
		double tempDia005 = 27.5;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 29.2;
		temperaturas[2] = 25.3;
		temperaturas[3] = 38;
		temperaturas[4] = 27.5;
		temperaturas[5] = 31;
		temperaturas[6] = 29;
		temperaturas[7] = 25;
		temperaturas[8] = 40;
		temperaturas[9] = 20;
		
		System.out.println("A temperatura do Dia 3 é: " + temperaturas[2]);
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		for(int i=0; i < temperaturas.length; i++) {
			System.out.println("A temperatura do Dia "+ (i+1) + " é: " + temperaturas[i]);	
		}
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
