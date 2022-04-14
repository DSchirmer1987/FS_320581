package quizmaster_dozent.model.spiel;

public class Stufe {
	private int stufe;
	private boolean safezone;
	private int betrag;
	
	public int getStufe() {
		return stufe;
	}
	public void setStufe(int stufe) {
		this.stufe = stufe;
	}
	public boolean isSafezone() {
		return safezone;
	}
	public void setSafezone(boolean safezone) {
		this.safezone = safezone;
	}
	public int getBetrag() {
		return betrag;
	}
	public void setBetrag(int betrag) {
		this.betrag = betrag;
	}
	
	public Stufe(int stufe, boolean safezone, int betrag) {
		this.setStufe(stufe);
		this.setSafezone(safezone);
		this.setBetrag(betrag);
	}
	@Override
	public String toString() {
		return "Stufe [getStufe()=" + getStufe() + ", isSafezone()=" + isSafezone() + ", getBetrag()=" + getBetrag()
				+ "]";
	}
}
