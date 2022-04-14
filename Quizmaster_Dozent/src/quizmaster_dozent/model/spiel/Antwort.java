package quizmaster_dozent.model.spiel;

public class Antwort {
	private String antwort;
	private Boolean markiert;
	
	public String getAntwort() {
		return antwort;
	}
	public void setAntwort(String antwort) {
		this.antwort = antwort;
	}
	public Boolean getMarkiert() {
		return markiert;
	}
	public void setMarkiert(Boolean markiert) {
		this.markiert = markiert;
	}
	
	public Antwort(String antwort) {
		this.setAntwort(antwort);
		this.setMarkiert(false);
	}
	
	public String toString() {
		return "Antwort: " + this.getAntwort() + " Markiert: " + this.getMarkiert();
	}
}
