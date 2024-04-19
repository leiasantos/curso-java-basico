package curso_java_basico.aula41;

public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		//pessoa.setEndereco("Rua das Rosas");
		aluno.setEndereco("Rua das Flores");
		professor.setEndereco("Rua das Orquidias");
		
	  // System.out.println(aluno.obterEtiquetaEndereco());
	 //  System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();

	}

}
