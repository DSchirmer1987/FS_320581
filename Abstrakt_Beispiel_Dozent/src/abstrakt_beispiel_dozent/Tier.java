package abstrakt_beispiel_dozent;

public abstract class Tier {
	private int beinAnzahl;
	private String fellfarbe;
	private boolean hungrig;
	private Geschlecht geschlecht;
	public int getBeinAnzahl() {
		return beinAnzahl;
	}
	public void setBeinAnzahl(int beinAnzahl) {
		this.beinAnzahl = beinAnzahl;
	}
	public String getFellfarbe() {
		return fellfarbe;
	}
	public void setFellfarbe(String fellfarbe) {
		this.fellfarbe = fellfarbe;
	}
	public boolean isHungrig() {
		return hungrig;
	}
	public void setHungrig(boolean hungrig) {
		this.hungrig = hungrig;
	}
	public Geschlecht getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}
	public Tier(int beinAnzahl, String fellfarbe, boolean hungrig, Geschlecht geschlecht) {
		super();
		this.beinAnzahl = beinAnzahl;
		this.fellfarbe = fellfarbe;
		this.hungrig = hungrig;
		this.geschlecht = geschlecht;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [getBeinAnzahl()=" + getBeinAnzahl() + ", getFellfarbe()=" + getFellfarbe() + ", isHungrig()="
				+ isHungrig() + ", getGeschlecht()=" + getGeschlecht() + "]";
	}
	
	public abstract void laufen();
}
