package quizmaster_dozent.model.spiel;

import java.util.Arrays;

public class Frage {
	private String frage;
	private Antwort[] antworten;
	private Stufe stufe;
	private int richtigeAntwort;
	
	public String getFrage() {
		return frage;
	}
	public void setFrage(String frage) {
		this.frage = frage;
	}
	public Antwort[] getAntworten() {
		return antworten;
	}
	public void setAntworten(Antwort[] antworten) {
		this.antworten = antworten;
	}
	public Stufe getStufe() {
		return stufe;
	}
	public void setStufe(Stufe stufe) {
		this.stufe = stufe;
	}
	public int getRichtigeAntwort() {
		return richtigeAntwort;
	}
	public void setRichtigeAntwort(int richtigeAntwort) {
		this.richtigeAntwort = richtigeAntwort;
	}
	
	public Frage(Stufe stufe) {
		this.setStufe(stufe);
		this.setAntworten(new Antwort[4]);
	}
	
	@Override
	public String toString() {
		return "Frage [getFrage()=" + getFrage() + ", getAntworten()=" + Arrays.toString(getAntworten())
				+ ", getStufe()=" + getStufe() + ", getRichtigeAntwort()=" + getRichtigeAntwort() + "]";
	}
	
	public void frageLaden() {
		// ToDo: Implementierung des Ladens der Frage, mit der richtigen Antwort
	}
	
	public void antwortenLaden() {
		// ToDo: Implementierung des Ladens der falschen Antworten
	}
}
