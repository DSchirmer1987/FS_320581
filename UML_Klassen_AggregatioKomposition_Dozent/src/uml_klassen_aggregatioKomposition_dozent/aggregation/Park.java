package uml_klassen_aggregatioKomposition_dozent.aggregation;

import java.util.ArrayList;

public class Park {
	private String name;
	private ArrayList<Sitzbank> baenke;
	private ArrayList<Spielplatz> spielplaetze;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Sitzbank> getBaenke() {
		return baenke;
	}
	public void setBaenke(ArrayList<Sitzbank> baenke) {
		this.baenke = baenke;
	}
	public ArrayList<Spielplatz> getSpielplaetze() {
		return spielplaetze;
	}
	public void setSpielplaetze(ArrayList<Spielplatz> spielplaetze) {
		this.spielplaetze = spielplaetze;
	}
	
	public Park(String name) {
		this.setName(name);
		this.setBaenke(new ArrayList<>());
		this.setSpielplaetze(new ArrayList<>());
	}
	
	public void spielplatzHinzufuegen(Spielplatz spielplatz) {
		this.getSpielplaetze().add(spielplatz);
	}
	
	public void spielplatzEntfernen(Spielplatz spielplatz) {
		this.getSpielplaetze().remove(spielplatz);
	}
	
	public void sitzbankHinzufuegen(Sitzbank sitzbank) {
		this.getBaenke().add(sitzbank);
	}
	
	public void sitzbankEntfernen(Sitzbank sitzbank) {
		this.getBaenke().remove(sitzbank);
	}
	@Override
	public String toString() {
		return "Park [getName()=" + getName() + ", getBaenke()=" + getBaenke() + ", getSpielplaetze()="
				+ getSpielplaetze() + "]";
	}
}
