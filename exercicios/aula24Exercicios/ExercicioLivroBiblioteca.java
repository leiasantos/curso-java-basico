package curso_java_basico.aula24Exercicios;

import java.util.Date;

public class ExercicioLivroBiblioteca {

	public static void main(String[] args) {

		/*
		 * Usando o resultado do modelo “Livro” como base, crie uma classe
		 * “LivroDeBiblioteca” que represente os dados básicos de um livro de uma
		 * biblioteca, que pode ser emprestado a leitores.
		 */
		
		LivroDeBiblioteca livro =  new LivroDeBiblioteca();
		
		livro.nome = "Dom Casmurro";
		livro.autor = "Machado de Assis";
		livro.anoLancamento = 2019;
		livro.idioma = "Português";
		livro.qtdPaginas = 368 ;
		livro.dataEntrega = new Date();
		livro.emprestado = true;
		livro.emprestadoPara = "Clara regina";
		

		
		
		

		System.out.println("Nome do Livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);
		System.out.println("Ano de lançamento = " + livro.anoLancamento);
		System.out.println("Idioma do livro = " +livro.idioma);
		System.out.println("Quantidade de páginas do livro = " +livro.qtdPaginas);
		System.out.println("Emprestado para = " + livro.emprestadoPara);
	
		

	}

}
