package abstrakt_beispiel_dozent;

public class App {

	public static void main(String[] args) {
		Katze katze = new Katze("Orange", false, Geschlecht.W);
		Hund hund = new Hund("Braun", true, Geschlecht.M);
		
		Tier tier = new Katze("Weiss", false, Geschlecht.M, "Miezi");
		
		
		Tier[] tiere;
		Katze[] katzen;
		
		hund.laufen();
		tier.laufen();
		
		System.out.println(katze);
		System.out.println(hund);
	}

}
