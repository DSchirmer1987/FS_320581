package grundlagen.classes;

/*
 * Jede Klasse besitzt folgende Elemente:
 * Attribute
 * Getter/Setter
 * Konstruktoren
 * toString-Methode
 * Eigenen Methoden (optional)
 */
public class Kuh {
	// Attribute - immer private
	private String name;
	private String farbe;
	private int alter;
	
	// Getter/Setter - für jedes Attribut. In der Reihenfolge Getter+Setter
	// Benennung get+Attributname / set+Attributname - Rückgabe immer Attributtyp
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		if(alter > 30) {
			this.alter = 30;
		} else {
			this.alter = alter;
		}
	}
	
	// Konstruktor(en)
	// Auch im Konstruktor die Setter benutzen
	public Kuh() {
		this.setName("Berta");
		this.setFarbe("lila");
		this.setAlter(125);
	}
	
	public Kuh(String name, String farbe, int alter) {
		this.setName(name);
		this.setFarbe(farbe);
//		this.setAlter(alter);
		this.alter = alter;
	}
	//toString-Methode
	@Override
	public String toString() {
		return "Kuh [getName()=" + getName() + ", getFarbe()=" + getFarbe() + ", getAlter()=" + getAlter() + "]";
	}
	
}
