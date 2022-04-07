package uml_aktivitaet_dozent;

public class Eingabe {
	private String eingabe;

	public String getEingabe() {
		return eingabe;
	}

	public void setEingabe(String eingabe) {
		this.eingabe = eingabe;
	}
	
	public Eingabe(String eingabe) {
		this.setEingabe(eingabe);
	}

	@Override
	public String toString() {
		return "Eingabe [getEingabe()=" + getEingabe() + "]";
	}
	
	
}
