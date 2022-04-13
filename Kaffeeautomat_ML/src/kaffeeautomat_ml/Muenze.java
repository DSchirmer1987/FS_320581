package kaffeeautomat_ml;

public enum Muenze {
	Ein_Cent(1, "1 Cent"), 
	Zwei_Cent(2, "2 Cent"), 
	Fuenf_Cent(5, "5 Cent"), 
	Zehn_Cent(10, "10 Cent"), 
	Zwanzig_Cent(20, "20 Cent"), 
	Fuenfzig_Cent(50, "50 Cent"), 
	Ein_Euro(100, "1 Euro"), 
	Zwei_Euro(200, "2 Euro");

	private final int centBetrag;
	private final String wortBetrag;
	
	Muenze(int i, String s) {
		this.centBetrag = i;
		this.wortBetrag = s;
	}
	
	public int getCentBetrag() {
		return this.centBetrag;
	}
	
	public String getWortBetrag() {
		return this.wortBetrag;
	}
}
