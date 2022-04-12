package interface_beispiel_dozent;

public class App {

	public static void main(String[] args) {
		String datei = "Spielstand.save";
		
		DateiSpeichher ds = new DateiSpeichher(datei);
		ds.dateiSpeichern();
		ds.dateiLaden();
		System.out.println("-----");
		
		DatenbankSpeicher dbs = new DatenbankSpeicher("Spielstaende", "Quizmaster");
		dbs.datenbankSpeichern();
		dbs.datenbankLaden();
		
		System.out.println("-----");
		Speicher s = new DateiSpeichher(datei);
		s = new DatenbankSpeicher("Quizmaster", "Spieler");
		s.speichern();
		s.laden();
	}

}
