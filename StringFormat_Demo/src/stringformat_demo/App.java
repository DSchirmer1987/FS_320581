package stringformat_demo;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		String name = "Daniel";
		Double wert = 3.1475;
		int zahl = 42;
		
		String formatiert = String.format("Name ist %-20s, %25s", name, "Schirmer");
		String formatiert2 = String.format("Wert ist %f %n %s", wert, name);
		
		System.out.println(formatiert);
		System.out.println(formatiert2);
		
		
		/*
		 * Formatierungen für Zahlen
		 */
		// Für Kommastellen bei Dezimalzahlen gilt %LängeGesamterWert.AnzahlKommastellenf
		String zwei_Kommastellen =  String.format("Wert ist %13.20f", wert);
		System.out.println(zwei_Kommastellen);
		
		/*
		 * Formatierungen zum Umwandeln von Zahlen
		 */
		String int_string = String.format("%d", zahl);
		String hex_string = String.format("%x", zahl);
		String octal_string = String.format("%o", zahl);
		String double_string = String.format("%2f", (double)zahl);
		String boolean_string = String.format("%b", zahl); // True if non-null, false if null
		System.out.println(int_string);
		System.out.println(hex_string);
		System.out.println(octal_string);
		System.out.println(double_string);
		System.out.println(boolean_string);
		
		
		/*
		 * Formatierungen  für Zeit und Datum
		 */
		LocalDate heute = LocalDate.now();
		String monat = String.format("%tb", heute);
		System.out.println(monat);
		
		System.out.printf("%tA", heute);
	}

}
