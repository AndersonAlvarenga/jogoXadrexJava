package Aplicacao;

import xadrex.PecaXadrex;

public class UI {

	public static void printTabuleiro(PecaXadrex[][] matrixPeca) {
		for (int i = 0; i < matrixPeca.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < matrixPeca.length; j++) {
				printPeca(matrixPeca[i][j]);
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
	}

	public static void printPeca(PecaXadrex peca) {
		if (peca == null) {
			System.out.print("-");
		} else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
