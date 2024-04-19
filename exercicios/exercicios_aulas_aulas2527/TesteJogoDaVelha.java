package curso_java_basico.exercicios_aulas_aulas2527;

import java.util.Scanner;

public class TesteJogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogoDaVelha = new JogoDaVelha();

		System.out.println("JOGADOR 1 = X");
		System.out.println("JOGADOR 2 = O");

		boolean ganhou = false;

		char sinal;

		int linha = 0;

		int coluna = 0;

		while (!ganhou) {

			if (jogoDaVelha.vezJogador1()) {

				System.out.println("Jogador 1 sua vez de jogar. Escolha linha e coluna(1-3).");
				sinal = 'X';

			} else {
				System.out.println("Jogador 2 sua vez de jogar. Escolha linha e coluna(1-3).");
				sinal = 'O';
			}

			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);

			jogoDaVelha.validarJogada(linha, coluna, sinal);

			jogoDaVelha.imprimirTabuleiro();

			if (jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("JOGADOR 1, PARABÉNS VOCÊ GANHOU !!!");
			} else {

			}
			if (jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("JOGADOR 2, PARABÉNS VOCÊ GANHOU !!!");
			} else if (jogoDaVelha.jogada > 9) {
				ganhou = true;
				System.out.println("Ops, Ninguem ganhou essa Partida.");
			}

		}

	}

	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + "(1, 2 ou 3)");
			valor = scan.nextInt();

			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente.");
			}

		}
		valor--;
		return valor;

	}

}
