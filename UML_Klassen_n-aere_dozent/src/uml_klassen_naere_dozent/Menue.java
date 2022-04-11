package uml_klassen_naere_dozent;

public class Menue {
	private Vorspeise vorspeise;
	private Hauptgericht hauptgericht;
	private Dessert dessert;
	
	public Vorspeise getVorspeise() {
		return vorspeise;
	}
	public void setVorspeise(Vorspeise vorspeise) {
		this.vorspeise = vorspeise;
	}
	public Hauptgericht getHauptgericht() {
		return hauptgericht;
	}
	public void setHauptgericht(Hauptgericht hauptgericht) {
		this.hauptgericht = hauptgericht;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public Menue(Vorspeise v, Hauptgericht h, Dessert d) {
		this.setVorspeise(v);
		this.setHauptgericht(h);
		this.setDessert(d);
		this.getVorspeise().menueEintragen(this);
	}
	
	@Override
	public String toString() {
		return "Menue [getVorspeise()=" /*+ getVorspeise()*/ + ", getHauptgericht()=" + getHauptgericht()
				+ ", getDessert()=" + getDessert() + "]";
	}
	
	
}
