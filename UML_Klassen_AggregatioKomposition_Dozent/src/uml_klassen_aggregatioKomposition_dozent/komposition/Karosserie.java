package uml_klassen_aggregatioKomposition_dozent.komposition;

public class Karosserie {
	private boolean istRostfrei;
	private boolean istSelbsttragend;
	private String idenfikationsnummer;
	public boolean isIstRostfrei() {
		return istRostfrei;
	}
	public void setIstRostfrei(boolean istRostfrei) {
		this.istRostfrei = istRostfrei;
	}
	public boolean isIstSelbsttragend() {
		return istSelbsttragend;
	}
	public void setIstSelbsttragend(boolean istSelbsttragend) {
		this.istSelbsttragend = istSelbsttragend;
	}
	public String getIdenfikationsnummer() {
		return idenfikationsnummer;
	}
	public void setIdenfikationsnummer(String idenfikationsnummer) {
		this.idenfikationsnummer = idenfikationsnummer;
	}
	public Karosserie(boolean istRostfrei, boolean istSelbsttragend, String idenfikationsnummer) {
		super();
		this.istRostfrei = istRostfrei;
		this.istSelbsttragend = istSelbsttragend;
		this.idenfikationsnummer = idenfikationsnummer;
	}
	@Override
	public String toString() {
		return "Karosserie [isIstRostfrei()=" + isIstRostfrei() + ", isIstSelbsttragend()=" + isIstSelbsttragend()
				+ ", getIdenfikationsnummer()=" + getIdenfikationsnummer() + "]";
	}
	
	
}
