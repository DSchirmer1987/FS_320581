package uml_aktivitaet_textcleaner_dozent;

public class App {

	public static void main(String[] args) {
		String text = "  Java ist eine tolle                Sprache! ";
//		text = null;
		TextCleaner textcleaner = new TextCleaner();
		System.out.println("Vorher:" + text);
		text = textcleaner.textSaeubern(text);
		System.out.println("Nachher: " + text);
	}

}
