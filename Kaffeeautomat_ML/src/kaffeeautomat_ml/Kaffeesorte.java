package kaffeeautomat_ml;

public enum Kaffeesorte {
	KAFFEE(100), CAPPUCINO(120), ESPRESSO(113);
	
	private final int preis;
	
	Kaffeesorte(int i) {
		this.preis = i;
	}
	
	public int getPreis() {
		return this.preis;
	}
	
	public String toString() {
		return "Sorte: " + this.name() + " Preis: " + (double)this.preis/100;
	}
}
