package brueck_saar_sequenzaufgabe;

public class Anlage {
	private Komponent[] komponente;
	private double anlagenpreis;

	public Komponent[] getKomponente() {
		return komponente;
	}

	public void setKomponente(Komponent[] komponente) {
		this.komponente = komponente;
	}
	
	public double getAnlagenpreis() {
		return anlagenpreis;
	}

	public void setAnlagenpreis(double anlagenpreis) {
		this.anlagenpreis = anlagenpreis;
	}

	public Anlage() {
		this.setKomponente(new Komponent[10]);
	}
	
	public Anlage(Komponent[] komponente) {
		this.setKomponente(komponente);
	}
	
	public void initAnlagenpreis() {
		this.setAnlagenpreis(0);
	}
	
	public void addiereKomponentenpreis(Double preis) {
		this.setAnlagenpreis(this.getAnlagenpreis() + preis);
	}
}
