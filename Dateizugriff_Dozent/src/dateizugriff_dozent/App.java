package dateizugriff_dozent;

public class App {

	public static void main(String[] args) {
		EasyRead lesen = new EasyRead("einkaufsliste.txt");
		lesen.readFile();
		
		EasyWrite schreiben = new EasyWrite("liste.txt");
		schreiben.writeFile("Hallo", "Welt", "heute", "ist", "Dienstag");
	}

}
