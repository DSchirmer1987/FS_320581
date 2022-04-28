package gui_beispiel_dozent.model;

public class Kunde {
	private String vorname;
	private String nachnamen;
	private String addresse;
	private String kundennummer;
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachnamen() {
		return nachnamen;
	}
	public void setNachnamen(String nachnamen) {
		this.nachnamen = nachnamen;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}
	
	public Kunde(String vorname, String nachnamen, String addresse, String kundennummer) {
		super();
		this.vorname = vorname;
		this.nachnamen = nachnamen;
		this.addresse = addresse;
		this.kundennummer = kundennummer;
	}
	
	@Override
	public String toString() {
		return "Kunde [getVorname()=" + getVorname() + ", getNachnamen()=" + getNachnamen() + ", getAddresse()="
				+ getAddresse() + ", getKundennummer()=" + getKundennummer() + "]";
	}
}
