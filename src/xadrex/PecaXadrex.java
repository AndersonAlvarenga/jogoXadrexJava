package xadrex;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrex extends Peca{

	private CorPeca cor;

	public PecaXadrex(Tabuleiro tabuleiro, CorPeca cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	public CorPeca getCor() {
		return cor;
	}
	
	
	

}
