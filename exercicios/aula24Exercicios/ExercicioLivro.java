package curso_java_basico.aula24Exercicios;

public class ExercicioLivro {

	public static void main(String[] args) {

		/*
		 * Crie uma classe Livro que represente os dados básicos de um livro, sem se
		 * preocupar com a sua finalidade.
		 */
		Livro livro = new Livro();
		
		livro.nome = "As coisas que você só vê quando desacelera";
		livro.autor = "Haemin Sunim";
		livro.anoLancamento = 2017;
		livro.idioma = "Português";
		
		
		

		System.out.println("Nome do Livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.idioma);
		

	}

}

