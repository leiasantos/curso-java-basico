package curso_java_basico.exercicios_aulas2527;

public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDasDisciplinas;
	double[][] notasDasDisciplinas;

	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);

		for (int i = 0; i < notasDasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDasDisciplinas[i]);
			for (int j = 0; j < notasDasDisciplinas[i].length; j++) {
				System.out.println(notasDasDisciplinas[i][j] + " ");
			}

			System.out.println();
		}

	}
	
	
	boolean verificarAprovado(int indice) {
		
		double soma = 0;
		
		for(int i = 0; i < notasDasDisciplinas[indice].length; i++) {
			soma += notasDasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		if(media >= 7) {
			return true;
		}
			return false;
		}
	}
	





