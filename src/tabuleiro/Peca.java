package tabuleiro;

public class Peca {
	protected Posicion posicao;
	private Tabuleiro tabuleiro;
	public Peca(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
	}
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	
}
