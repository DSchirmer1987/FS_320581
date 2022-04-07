package uml_aktivitaet_dozent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Eingabe eingabe = eingabeLesen();
		eingabeAusgeben(eingabe);
		System.out.println("LIFO");
		lifoBeispiel();
		System.out.println("FIFO");
		fifoBeispiel();
	}
	
	public static Eingabe eingabeLesen() {
		Eingabe ein = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Eingabe: ");
		try {
			ein = new Eingabe(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ein;
	}
	
	public static void eingabeAusgeben(Eingabe ein) {
		System.out.println(ein.getEingabe());
	}
	
	public static void lifoBeispiel() {
		Eingabe ein = null;
		Stack<Eingabe> stapel = new Stack<Eingabe>();
		
		for(int i= 0; i < 5; i++) {
			ein = eingabeLesen();
			stapel.push(ein);
		}
		
//		for(int i= 0; i < 5; i++) {
//			eingabeAusgeben(stapel.pop());
//		}
		
		while(!stapel.empty()) {
			eingabeAusgeben(stapel.pop());
		}
	}
	
	public static void fifoBeispiel() {
		Eingabe ein = null;
		ArrayList<Eingabe> liste = new ArrayList<Eingabe>();
		
		for(int i = 0; i < 5; i++) {
			ein = eingabeLesen();
			liste.add(ein);
		}
		
		/*
		 * For-Each
		 * For (jedes Element : Sammlung)
		 */
		for (Eingabe eingabe : liste) {
			eingabeAusgeben(eingabe);
		}
	}
}
