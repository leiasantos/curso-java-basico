package curso_java_basico.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Engenharia da Computação");
		double[] notas = {10,9,8,10};
		aluno.setNotas(notas);
		
		
		System.out.println(aluno);
		
		String s1 = "sdsdsds";
		String s2 = "sdsdsdS";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
	}

}
