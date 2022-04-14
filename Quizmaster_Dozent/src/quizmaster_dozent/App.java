package quizmaster_dozent;

import quizmaster_dozent.model.spiel.Gewinntabelle;
import quizmaster_dozent.model.spiel.Stufe;

public class App {

	public static void main(String[] args) {
		Gewinntabelle gt = new Gewinntabelle(15);
		for(Stufe stufe : gt.getStufen()) {
			System.out.println(stufe);
		}

	}

}
