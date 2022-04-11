package uml_klassen_aggregatioKomposition_dozent.komposition;

public class Reifen {
	private String hersteller;
	private String art;
	private int breite;
	
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	public Reifen(String hersteller, String art, int breite) {
		super();
		this.hersteller = hersteller;
		this.art = art;
		this.breite = breite;
	}
	@Override
	public String toString() {
		return "Reifen [getHersteller()=" + getHersteller() + ", getArt()=" + getArt() + ", getBreite()=" + getBreite()
				+ "]";
	}
	
	
}
