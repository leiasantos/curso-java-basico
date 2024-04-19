package curso_java_basico.aula24Exercicios;

public class ExercicioLivroLivraria {

	public static void main(String[] args) {
	
		/*
		 * Usando o resultado do exercício anterior como base, crie uma classe
		 * “LivroDeLivraria” que represente os dados básicos de um livro que está à
		 * venda em uma livraria.
		 */
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "O sol é para todos ";
		livro.autor = "Harper Lee";
		livro.anoLancamento = 2006;
		livro.idioma = "Português";
		livro.qtdPaginas = 349;
		livro.preco = 48.90;
		
		
		

		System.out.println("Nome do Livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);
		System.out.println("Ano de lançamento = " + livro.anoLancamento);
		System.out.println("Idioma do livro = " +livro.idioma);
		System.out.println("Quantidade de páginas do livro = " +livro.qtdPaginas);
		System.out.println("Valor capa comum = " + livro.preco);
	}

}
