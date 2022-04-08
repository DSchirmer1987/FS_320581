package uml_aktivitaet_schleife_dozent;

public class App {

	public static void main(String[] args) {
		zaehleBuchstaben("Java ist eine super Sprache zum Lernen!");
		
	}
	
	
	public static void zaehleBuchstaben(String text) {
		int klein = 0, gross = 0, i = 0;
		while(i < text.length()) {
			if(Character.isUpperCase(text.charAt(i))) {
				gross++;
			} else {
				klein++;
			}
			i++;
		}
		
		for(klein = gross = i = 0; i < text.length(); i++) {
			if(Character.isUpperCase(text.charAt(i))) {
				gross++;
			} else {
				klein++;
			}
		}
		
		System.out.println("Großbuchstaben: " + gross);
		System.out.println("Kleinbuchstaben " + klein);
	}
}
