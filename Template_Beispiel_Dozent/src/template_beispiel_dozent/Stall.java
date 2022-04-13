package template_beispiel_dozent;

import java.util.ArrayList;

/*
 * <T> - zum kennzeichen der Klasse als Template/Generic
 * Bedeutet, wir müssen beim erstellen von Objekten dieser Klasse, 
 *                 diese an einen BESTIMMTEN Datentypen festlegen
 */
public class Stall<T> {
	private ArrayList<T> bewohner;

	public ArrayList<T> getBewohner() {
		return bewohner;
	}

	public void setBewohner(ArrayList<T> bewohner) {
		this.bewohner = bewohner;
	}

	public Stall(ArrayList<T> bewohner) {
		super();
		this.bewohner = bewohner;
	}
	
	public Stall() {
		/*
		 * this() = Konstruktoraufruf der eigenen Klasse
		 */
		this(new ArrayList<T>());
	}
	
	
	public void hinzufuegen(T element) {
		this.getBewohner().add(element);
	}
}
