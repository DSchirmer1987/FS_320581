package gui_beispiel_dozent.model;

import java.util.ArrayList;

public class Kundenspeicher {
	private ArrayList<Kunde> kunden;

	public ArrayList<Kunde> getKunden() {
		return kunden;
	}

	public void setKunden(ArrayList<Kunde> kunden) {
		this.kunden = kunden;
	}

	public Kundenspeicher(ArrayList<Kunde> kunden) {
		super();
		this.kunden = kunden;
	}

	@Override
	public String toString() {
		return "Kundenspeicher [getKunden()=" + getKunden() + "]";
	}
	
	
}
