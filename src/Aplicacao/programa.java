package Aplicacao;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import tabuleiro.Posicion;
import xadrex.PartidaXadrex;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartidaXadrex partida1 = new PartidaXadrex();
UI.printTabuleiro(partida1.getPecas());
	}

}
