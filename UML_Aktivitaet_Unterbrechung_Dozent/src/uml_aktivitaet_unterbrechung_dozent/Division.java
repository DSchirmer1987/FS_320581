package uml_aktivitaet_unterbrechung_dozent;

public class Division {
	private double nenner;
	private double zaehler;
	private double quotient;
	
	public double getNenner() {
		return nenner;
	}
	public void setNenner(double nenner) {
		this.nenner = nenner;
	}
	public double getZaehler() {
		return zaehler;
	}
	public void setZaehler(double zaehler) {
		this.zaehler = zaehler;
	}
	public double getQuotient() {
		return quotient;
	}
	public void setQuotient(double quotient) {
		this.quotient = quotient;
	}
	
	public Division() {
		
	}
	@Override
	public String toString() {
		return "Division [getNenner()=" + getNenner() + ", getZaehler()=" + getZaehler() + ", getQuotient()="
				+ getQuotient() + "]";
	}
	
	public double dividiere(double zaehler, double nenner) throws Exception{
		if(nenner == 0) {
			throw new Exception("Nenner ist gleich 0!");
		}
		return zaehler/nenner;
	}
}
