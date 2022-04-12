package abstrakt_beispiel_dozent;

public class Katze extends Tier{
	public String name;
	public Katze(String fellfarbe, boolean hungrig, Geschlecht geschlecht) {
		super(4, fellfarbe, hungrig, geschlecht);
	}
	
	public Katze(String fellfarbe, boolean hungrig, Geschlecht geschlecht, String name) {
		super(4, fellfarbe, hungrig, geschlecht);
		this.name = name;
	}

	@Override
	public void laufen() {
		System.out.println("Katze läuft");
		
	}

	@Override
	public String toString() {
		return "Katze [getBeinAnzahl()=" + getBeinAnzahl() + ", getFellfarbe()=" + getFellfarbe() + ", isHungrig()="
				+ isHungrig() + ", getGeschlecht()=" + getGeschlecht() + "]";
	}
	
	
}
