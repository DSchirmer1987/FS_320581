package enum_beispiel_dozent;

public enum Land {
	Deutschland("0049", Stadt.Berlin),
	Frankreich("0043", Stadt.Bielefeld),
	Luxemburg("0352", Stadt.Dresden), 
	Niederlande("0031", Stadt.Duisburg), 
	Belgien("0032", Stadt.Hamburg);
	
	private final String vorwahl;
	private final Stadt stadt;
	
	Land(String vorwahl, Stadt stadt) {
		this.vorwahl = vorwahl;
		this.stadt = stadt;
	}
	
	public String getVorwahl() {
		return this.vorwahl;
	}
	
	public Stadt stadt() {
		return this.stadt;
	}
	
	public String toString() {
		return this.name() + " Vorwahl: " + this.vorwahl + " Stadt: " + this.stadt;
	}
}
