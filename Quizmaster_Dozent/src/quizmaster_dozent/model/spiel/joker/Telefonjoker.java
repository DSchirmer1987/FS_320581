package quizmaster_dozent.model.spiel.joker;

import java.util.Random;

import quizmaster_dozent.model.spiel.Antwort;
import quizmaster_dozent.model.spiel.Frage;

public class Telefonjoker extends Joker {

	public Telefonjoker(boolean nutzbar) {
		super("Telefonjoker", nutzbar, 50);
	}

	@Override
	public void anwenden(Frage frage) {
		// Random zum erzeugen von Zufällen
		Random zufall = new Random();
		
		Antwort[] auswahlAntworten = new Antwort[2];
		auswahlAntworten[0] = frage.getAntworten()[frage.getRichtigeAntwort()];
		
		// Erzeugen einer Zufallszahl zwischen 0 und 3
		int zufallsZahl = zufall.nextInt(4);
		// Prüfen, dass die Zufallszahl nicht dieselbe ist, wie bei der richtigen Antwort
		while(zufallsZahl == frage.getRichtigeAntwort()) {
			zufallsZahl = zufall.nextInt(4);
		}
		auswahlAntworten[1] = frage.getAntworten()[zufallsZahl];
		
		// Wenn neue Zufallszahl 0 ist dann wird die richtige Antwort ausgewählt.
		if(zufall.nextInt(2) == 0) {
			frage.getAntworten()[frage.getRichtigeAntwort()].setMarkiert(true);
		//Ansonsten wird die zweite Antwort ausgewählt
		} else {
			for(int i=0; i < frage.getAntworten().length; i++) {
				// Prüfen ob die Antwort in dem gespeicherten Array, dieselbe ist wie im Array von der Frage
				// Wenn ja, dann wird diese Antwort markiert.
				if(auswahlAntworten[1].equals(frage.getAntworten()[i])) {
					frage.getAntworten()[i].setMarkiert(true);
				}
			}
		}
		this.setNutzbar(false);
	}
}
