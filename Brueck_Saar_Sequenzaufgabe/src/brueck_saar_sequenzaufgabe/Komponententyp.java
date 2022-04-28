package brueck_saar_sequenzaufgabe;

public class Komponententyp {
	private double preis;

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public Komponententyp(double preis) {
		super();
		this.preis = preis;
	}
	
	public double holePreis() {
		return this.getPreis();
	}
}
