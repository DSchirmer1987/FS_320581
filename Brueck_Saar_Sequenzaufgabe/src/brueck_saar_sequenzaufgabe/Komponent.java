package brueck_saar_sequenzaufgabe;

public class Komponent {
	private Komponententyp typ;

	public Komponententyp getTyp() {
		return typ;
	}

	public void setTyp(Komponententyp typ) {
		this.typ = typ;
	}

	public Komponent(Komponententyp typ) {
		super();
		this.typ = typ;
	}
	
	public Komponententyp holeKomponententyp() {
		return this.getTyp();
	}
}
