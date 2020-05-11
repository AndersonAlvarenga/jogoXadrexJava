package tabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;

	private Peca[][] matrizPeca;

	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.matrizPeca = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int linha,int coluna) {
		return matrizPeca[linha][coluna];	
	}
	public Peca peca(Posicion posicao) {
		return matrizPeca[posicao.getRow()][posicao.getColun()];
	}
}
