package uml_aktivitaet_unterbrechung_dozent;

public class App {

	public static void main(String[] args) throws Exception {
		Division div = new Division();
		double quotient = 0;
		while(true) {
			double zaehler = Math.round(Math.random());
			double nenner = Math.round(Math.random());
			System.out.println("Zähler: " + zaehler + " | Nenner: " + nenner);
			quotient = div.dividiere(zaehler, nenner);
			System.out.println(quotient);
		}	
	}
}
