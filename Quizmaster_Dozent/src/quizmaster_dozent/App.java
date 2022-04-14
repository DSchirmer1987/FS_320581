package quizmaster_dozent;

import quizmaster_dozent.model.spiel.Antwort;
import quizmaster_dozent.model.spiel.Frage;
import quizmaster_dozent.model.spiel.Gewinntabelle;
import quizmaster_dozent.model.spiel.Stufe;
import quizmaster_dozent.model.spiel.joker.Telefonjoker;

public class App {

	public static void main(String[] args) {
//		Gewinntabelle gt = new Gewinntabelle(15);
//		for(Stufe stufe : gt.getStufen()) {
//			System.out.println(stufe);
//		}
		
		Antwort[] antworten = new Antwort[4];
		antworten[0] = new Antwort("Ja");
		antworten[1] = new Antwort("Nein");
		antworten[2] = new Antwort("Niemals");
		antworten[3] = new Antwort("Möglich");
		
		Frage frage = new Frage(new Stufe(1, false, 50));
		frage.setAntworten(antworten);
		frage.setFrage("Sind Sie bereit für das Wochenende?");
		frage.setRichtigeAntwort(0);
		
		Telefonjoker tj = new Telefonjoker(true);
		
		System.out.println(frage);
		tj.anwenden(frage);
		System.out.println(frage);
	}
}
