package tabuleiro;

public class Posicion {

	private int row;
	private int colun;
	public Posicion(int row, int colun) {
		super();
		this.row = row;
		this.colun = colun;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColun() {
		return colun;
	}
	public void setColun(int colun) {
		this.colun = colun;
	}
	
	@Override
	public String toString() {
		return row+","+colun;
	}
}
