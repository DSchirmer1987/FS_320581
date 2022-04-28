package brueck_saar_sequenzaufgabe;

public class App {

	public static void main(String[] args) {
		Komponententyp ersatzteil = new Komponententyp(125);
		Komponententyp bauteil = new Komponententyp(250);
		
		Komponent[] komponenten = new Komponent[10];
		for(int i = 0; i<5; i++) {
			komponenten[i] = new Komponent(ersatzteil);
		}
		for(int i = 5; i<10; i++) {
			komponenten[i] = new Komponent(bauteil);
		}
		
		Anlage anlage = new Anlage(komponenten);
		
		
		// Aufgabe
		anlage.initAnlagenpreis();
		for(Komponent komponent : anlage.getKomponente()) {
			Komponententyp typ = komponent.holeKomponententyp();
			Double preis = typ.holePreis();
			
			anlage.addiereKomponentenpreis(preis);
		}

	}

}
