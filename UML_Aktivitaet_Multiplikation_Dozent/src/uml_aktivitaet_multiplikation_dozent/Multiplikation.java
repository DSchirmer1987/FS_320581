package uml_aktivitaet_multiplikation_dozent;

public class Multiplikation {
	
	public int multipliziere(int multiplikand, int multiplikator) {
		int produkt = 0;
		int i = 0;
		
		while (i < Math.abs(multiplikand)) {
			if(multiplikand >= 0) {
				produkt = produkt + multiplikator;
			} else {
				produkt = produkt - multiplikator;
			}
			i++;
		}
		
		return produkt;
	}
}
