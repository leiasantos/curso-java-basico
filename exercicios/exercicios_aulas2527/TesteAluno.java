package curso_java_basico.exercicios_aulas2527;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		/*
		 * Escreva uma class para representar um Aluno. Adicione atributos relacionados
		 * às caracteristicas de um Aluno, como nome, matricula, curso que está
		 * matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3
		 * disciplinas. Desenvolva um método para verificar se o aluno está aprovado
		 * (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa
		 * para testar essa classe, que pede as informações do aluno ao usuário e ao
		 * final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi
		 * aprovado ou não
		 */
		
		try (Scanner scan = new Scanner(System.in)) {
			Aluno aluno = new Aluno();
			
			System.out.println("Digite o nome do ALUNO");
			aluno.nome = scan.next();
			
			
			System.out.println("Digite o nome do CURSO");
			aluno.nomeCurso = scan.next();
			
			System.out.println("Digite o número da MATRICULA");
			aluno.matricula = scan.next();
			
			
			aluno.nomeDasDisciplinas = new String[3];
			for(int i = 0; i  < aluno.nomeDasDisciplinas.length; i++) {
				System.out.println("Digite o nome da DISCIPLINA" + i);
				aluno.nomeDasDisciplinas[i] = scan.next();

			}
			
			aluno.notasDasDisciplinas = new double[3][4];
			
			for(int i = 0; i < aluno.notasDasDisciplinas.length; i++) {
				System.out.println("Obtendo notas da disciplina " + aluno.notasDasDisciplinas);
			for(int j = 0; j < aluno.notasDasDisciplinas[i].length; j++) {
				System.out.println("Digite a nota " + (j+1));
				aluno.notasDasDisciplinas[i][j] = scan.nextDouble();
			}
}
			
			aluno.mostrarInfo();
			
			for(int i = 0; i < aluno.nomeDasDisciplinas.length; i++) {
				if(aluno.verificarAprovado(i)) {
					System.out.println("Disciplina " + aluno.nomeDasDisciplinas[i] + "Foi aprovado");
										
				}else {
					System.out.println("Disciplina " + aluno.nomeDasDisciplinas[i] + "Foi reprovado");
				}
			}
		}
		
	
	}

}
