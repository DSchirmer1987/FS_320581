package uml_klassen_aggregatioKomposition_dozent.aggregation;

public class Spielplatz {
	private String art;
	private int anzahlSchaukeln;
	private String bezeichnung;
	private boolean hatSandkasten;
	
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public int getAnzahlSchaukeln() {
		return anzahlSchaukeln;
	}
	public void setAnzahlSchaukeln(int anzahlSchaukeln) {
		this.anzahlSchaukeln = anzahlSchaukeln;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public boolean isHatSandkasten() {
		return hatSandkasten;
	}
	public void setHatSandkasten(boolean hatSandkasten) {
		this.hatSandkasten = hatSandkasten;
	}
	
	public Spielplatz(String art, int anzahlSchaukeln, String bezeichnung, boolean hatSandkasten) {
		this.setArt(art);
		this.setAnzahlSchaukeln(anzahlSchaukeln);
		this.setBezeichnung(bezeichnung);
		this.setHatSandkasten(hatSandkasten);
	}
	@Override
	public String toString() {
		return "Spielplatz [getArt()=" + getArt() + ", getAnzahlSchaukeln()=" + getAnzahlSchaukeln()
				+ ", getBezeichnung()=" + getBezeichnung() + ", isHatSandkasten()=" + isHatSandkasten() + "]";
	}
	
	
}
