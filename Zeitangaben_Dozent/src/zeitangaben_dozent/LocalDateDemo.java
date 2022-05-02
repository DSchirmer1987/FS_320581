package zeitangaben_dozent;

import java.time.LocalDate;

public class LocalDateDemo {
	private int tag;
	private int monat;
	private int jahr;
	private LocalDate datum;
	
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getMonat() {
		return monat;
	}
	public void setMonat(int monat) {
		this.monat = monat;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	public LocalDate getDatum() {
		return datum;
	}
	
	public LocalDateDemo() {
		// Das Attribut "datum" auf den heutigen Tag setzen
		this.datum = LocalDate.now();
		
		// Den einzelnen Tag aus einem Datum holen
		this.setTag(this.datum.getDayOfMonth());
		// Monat
		this.setMonat(this.datum.getMonthValue());
		// Jahr
		this.setJahr(this.datum.getYear());
	}
	
	public LocalDateDemo(int tag, int monat, int jahr) {
		this.setTag(tag);
		this.setMonat(monat);
		this.setJahr(jahr);
		
		// Das Datum mit Tag, Monat und Jahr aufbauen.
		this.datum = LocalDate.of(jahr, monat, tag);
	}
}
