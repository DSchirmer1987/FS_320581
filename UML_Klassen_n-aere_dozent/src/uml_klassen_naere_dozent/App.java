package uml_klassen_naere_dozent;

public class App {

	public static void main(String[] args) {
		Vorspeise suppe = new Vorspeise();
		Menue menue1 = new Menue(suppe, null, null);
		Menue menue2 = new Menue(suppe, null, null);
		
		System.out.println(suppe);

	}

}
