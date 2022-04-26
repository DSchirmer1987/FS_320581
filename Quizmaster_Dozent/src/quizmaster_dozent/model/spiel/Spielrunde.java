package quizmaster_dozent.model.spiel;

import java.util.ArrayList;

import quizmaster_dozent.model.spiel.joker.Joker;

public class Spielrunde {
	private Spieler spieler;
	private ArrayList<Frage> fragen;
	private Gewinntabelle gewinntabelle;
	private int aktuelleStufe;
	private ArrayList<Joker> jokers;
	
	public Spieler getSpieler() {
		return spieler;
	}
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
	public ArrayList<Frage> getFragen() {
		return fragen;
	}
	public void setFragen(ArrayList<Frage> fragen) {
		this.fragen = fragen;
	}
	public Gewinntabelle getGewinntabelle() {
		return gewinntabelle;
	}
	public void setGewinntabelle(Gewinntabelle gewinntabelle) {
		this.gewinntabelle = gewinntabelle;
	}
	public int getAktuelleStufe() {
		return aktuelleStufe;
	}
	public void setAktuelleStufe(int aktuelleStufe) {
		this.aktuelleStufe = aktuelleStufe;
	}
	public ArrayList<Joker> getJokers() {
		return jokers;
	}
	public void setJokers(ArrayList<Joker> jokers) {
		this.jokers = jokers;
	}
	
	public Spielrunde(Spieler spieler, ArrayList<Frage> fragen, Gewinntabelle gewinntabelle, int aktuelleStufe,
			ArrayList<Joker> jokers) {
		super();
		this.spieler = spieler;
		this.fragen = fragen;
		this.gewinntabelle = gewinntabelle;
		this.aktuelleStufe = aktuelleStufe;
		this.jokers = jokers;
	}
	
	public void spielrundeAufbauen() {
		// To-do - Wird noch implementiert
	}
}
