package uml_aktivitaet_gabelung_dozent;

public class App {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Zählen beginnt");
		
		Zaehler zaehler1 = new Zaehler(3, "Zaehler 1");
		Zaehler zaehler2 = new Zaehler(6, "Zaehler 2");
		zaehler1.start();
		zaehler2.start();
		
		zaehler1.join();
		zaehler2.join();
		
		System.out.println("Zählen beendet");
	}

}
