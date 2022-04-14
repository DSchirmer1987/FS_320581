package quizmaster_dozent.model.spiel.joker;

import quizmaster_dozent.model.spiel.Frage;

public abstract class Joker {
	private String bezeichnung;
	private boolean nutzbar;
	private int wahrscheinlichkeit;
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public boolean isNutzbar() {
		return nutzbar;
	}
	public void setNutzbar(boolean nutzbar) {
		this.nutzbar = nutzbar;
	}
	public int getWahrscheinlichkeit() {
		return wahrscheinlichkeit;
	}
	public void setWahrscheinlichkeit(int wahrscheinlichkeit) {
		this.wahrscheinlichkeit = wahrscheinlichkeit;
	}
	
	public Joker(String bezeichnung, boolean nutzbar, int wahrscheinlichkeit) {
		this.setBezeichnung(bezeichnung);
		this.setNutzbar(nutzbar);
		this.setWahrscheinlichkeit(wahrscheinlichkeit);
	}
	
	@Override
	public String toString() {
		return "Joker [getBezeichnung()=" + getBezeichnung() + ", isNutzbar()=" + isNutzbar()
				+ ", getWahrscheinlichkeit()=" + getWahrscheinlichkeit() + "]";
	}
	
	public abstract void anwenden(Frage frage);
}
