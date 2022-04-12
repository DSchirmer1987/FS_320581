package abstrakt_beispiel_dozent;

public class Hund extends Tier{

	public Hund(String fellfarbe, boolean hungrig, Geschlecht geschlecht) {
		super(4, fellfarbe, hungrig, geschlecht);
	}

	@Override
	public void laufen() {
		System.out.println("Hund läuft");
		
	}
	
}
