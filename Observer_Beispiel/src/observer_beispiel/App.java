package observer_beispiel;

public class App {

	public static void main(String[] args) {
		Kellner kellner1 = new Kellner("Bert");
		Kellner kellner2 = new Kellner("Manfred");
		Gast gast1 = new Gast("Elfriede");
		Gast gast2 = new Gast("Wilhelm");
		
		gast1.addObserver(kellner1);
		gast1.addObserver(kellner2);
		
		gast2.addObserver(kellner2);
		
		gast1.kellnerRufen();
		gast2.kellnerRufen();
	}

}
