package kaffeeautomat_ml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kaffeeautomat {
	private ArrayList<Kaffeesorte> kaffeesorten;
	private Scanner eingabe;

	public ArrayList<Kaffeesorte> getKaffeesorten() {
		return kaffeesorten;
	}
	
	public void setKaffeesorten(ArrayList<Kaffeesorte> kaffeesorten) {
		this.kaffeesorten = kaffeesorten;
	}
	
	public Kaffeeautomat(String etage) {
		this.kaffeesorten = new ArrayList<Kaffeesorte>(Arrays.asList(Kaffeesorte.values()));
		if(etage == "Erdgeschoss") {
			this.kaffeesorten.remove(Kaffeesorte.CAPPUCINO);
		}
		this.eingabe = new Scanner(System.in);
	}
	
	public void printPreisliste() {
		for(Kaffeesorte sorte : this.getKaffeesorten()) {
			System.out.println(sorte);
		}
	}
	
	public void printAkzeptierteMuenzen() {
		System.out.println("Akzeptierte Muenzen:");
		for(Muenze muenze : Muenze.values()) {
			System.out.println(muenze.getWortBetrag());
		}
	}
	
	public void sortenAuswahl() {
		System.out.println("Es sind folgende Kaffeesorten verfügbar:");
		this.printPreisliste();
		System.out.println("Bitte wählen Sie aus:");
		
		// Nutzereingabe lesen und als String speichern
		String nutzereingabe = eingabe.nextLine();
		// Wenn Abbruch eingegeben wurde, verlasse die Methode
		if(nutzereingabe.equals("Abbruch")) {
			return;
		}
		for(Kaffeesorte sorte : this.getKaffeesorten()) {
			// Vergleiche den Namen der ENUM mit der Eingabe vom Benutzer (String.equalsIgnoreCase)
			// Nicht beachten der Groß/Kleinschreibung
			if(sorte.name().equalsIgnoreCase(nutzereingabe)) {
				System.out.println("Sie haben " + sorte + " gewählt.");
				this.muenzEinwurf(sorte.getPreis(), sorte);
				return;
			}
		}
		this.sortenAuswahl();
	}
	
	public void muenzEinwurf(int preis, Kaffeesorte sorte) {
		System.out.println("Bitte werfen Sie die Münzen in den Automaten.");
		this.printAkzeptierteMuenzen();
		int einwurfGesamt = 0;
		
		// Schleife solange der Einwurf kleiner als Preis ist
		while(einwurfGesamt < preis) {
			//Einlesen der Nutzereingabe
			String einwurf = eingabe.nextLine();
			if(einwurf.equalsIgnoreCase("Abbruch")) {
				break;
			} 
			for(Muenze muenze : Muenze.values()) {
				// Aus dem Enum den Wert vergleichen mit dem eingegebenen Wert.
				if(muenze.getWortBetrag().equalsIgnoreCase(einwurf)) {
					einwurfGesamt += muenze.getCentBetrag();
				}
			}
			if(einwurfGesamt < preis) {
				System.out.println("Es sind noch " + ((double)(preis - einwurfGesamt)/100) + " offen.");
			}else {
				System.out.println("Sie bekommen " + Math.abs(((double)(preis - einwurfGesamt)/100)) + " an Rückgeld ausgezahlt");
				System.out.println("Vielen Dank, genießen Sie Ihren " + sorte.name() + "!");
			}
		}
	}
}
