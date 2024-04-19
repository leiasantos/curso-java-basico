package curso_java_basico.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 6;
		notasAlunos[0][3] = 9;

		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 10;
		notasAlunos[1][2] = 10;
		notasAlunos[1][3] = 10;

		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 5;
		notasAlunos[2][3] = 3;

		// imprimindo uma matriz na tela

		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i] + " ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}

		// mudando valor de uma célula da matriz

		notasAlunos[1][3] = 8;
		System.out.println();

		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i] + " ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}

		// calculando a média de notas de cada aluno

		System.out.println("Calculando a média de cada aluno");

		double soma = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];

			}
			System.out.println("Média do aluno " + i + " é " + (soma / 4));
		}
		
		
	}
}
