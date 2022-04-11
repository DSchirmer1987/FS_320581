package uml_klassen_aggregatioKomposition_dozent;

import java.util.ArrayList;

import uml_klassen_aggregatioKomposition_dozent.aggregation.Park;
import uml_klassen_aggregatioKomposition_dozent.aggregation.Sitzbank;
import uml_klassen_aggregatioKomposition_dozent.aggregation.Spielplatz;
import uml_klassen_aggregatioKomposition_dozent.komposition.Auto;
import uml_klassen_aggregatioKomposition_dozent.komposition.Karosserie;
import uml_klassen_aggregatioKomposition_dozent.komposition.Motor;
import uml_klassen_aggregatioKomposition_dozent.komposition.Reifen;

public class App {

	public static void main(String[] args) {
		/*
		 * Aggregation
		 */
		Park park1 = new Park("Schillerpark");
		Spielplatz spielplatz1 = new Spielplatz("Fussball", 0, "Fussbalspielplatz Ecke", false);
		Sitzbank[] sitzbaenke = new Sitzbank[5];
		
		for(int i = 0; i < sitzbaenke.length; i++) {
			sitzbaenke[i] = new Sitzbank(i, "Grün");
			park1.sitzbankHinzufuegen(sitzbaenke[i]);
		}
		
		park1.spielplatzHinzufuegen(spielplatz1);
		System.out.println(park1);
		
		park1.sitzbankEntfernen(sitzbaenke[3]);
		
		/*
		 * Komposition
		 */
		Motor m = new Motor(900, 42, 20000);
		Reifen r = new Reifen("GoodYear", "Winterreifen", 95);
		Karosserie k = new Karosserie(false, false, "2342");
		
		Auto auto1 = new Auto(m, k, r);
		Auto auto2 = null;
		try {
			auto2 = new Auto(m, k, null);
		} catch (Exception e) {
			
		}
		
		Auto auto3 = new Auto(new Motor(300, 8, 4000), new Karosserie(false, false, "1234"), new Reifen("Pirelli", "Slicks", 120));
		
		auto3 = null;
		System.out.println(auto1);
		System.out.println(auto2);
	}

}
