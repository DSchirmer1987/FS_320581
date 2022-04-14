package quizmaster_dozent.model.spiel;

public class Spieler {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Spieler(String name) {
		this.setName(name);
	}
	
	public String toString() {
		return "Spieler: " + this.getName();
	}
}
