package xadrex;

import tabuleiro.Tabuleiro;

public class PartidaXadrex {
	private Tabuleiro tabuleiroJogo;

	public PartidaXadrex() {
		tabuleiroJogo = new Tabuleiro(8, 8);
	}

	public PecaXadrex[][] getPecas() {
		PecaXadrex[][] aux = new PecaXadrex[tabuleiroJogo.getLinhas()][tabuleiroJogo.getColunas()];
		for (int i = 0; i < tabuleiroJogo.getLinhas(); i++) {
			for (int j = 0; j < tabuleiroJogo.getColunas(); j++) {
				aux[i][j] = (PecaXadrex) tabuleiroJogo.peca(i, j);
			}
		}
		return aux;
	}
}
