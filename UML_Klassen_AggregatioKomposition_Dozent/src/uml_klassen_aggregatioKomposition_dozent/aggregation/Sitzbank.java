package uml_klassen_aggregatioKomposition_dozent.aggregation;

public class Sitzbank {
	private int nummer;
	private String farbe;
	
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public Sitzbank(int nummer, String farbe) {
		super();
		this.nummer = nummer;
		this.farbe = farbe;
	}
	@Override
	public String toString() {
		return "Sitzbank [getNummer()=" + getNummer() + ", getFarbe()=" + getFarbe() + "]";
	}
	
	
}
