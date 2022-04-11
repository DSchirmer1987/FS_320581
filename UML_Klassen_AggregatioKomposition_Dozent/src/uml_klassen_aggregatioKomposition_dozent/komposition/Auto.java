package uml_klassen_aggregatioKomposition_dozent.komposition;

public class Auto {
	private Motor motor;
	private Karosserie karosserie;
	private Reifen reifen;
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Karosserie getKarosserie() {
		return karosserie;
	}
	public void setKarosserie(Karosserie karosserie) {
		this.karosserie = karosserie;
	}
	public Reifen getReifen() {
		return reifen;
	}
	public void setReifen(Reifen reifen) {
		this.reifen = reifen;
	}
	public Auto(Motor motor, Karosserie karosserie, Reifen reifen) throws IllegalArgumentException {
		super();
		if(motor == null || karosserie == null || reifen == null) {
			throw new IllegalArgumentException("Motor, Karosserie und Reifen dürfen nicht NULL sein!");
		} else {
			this.motor = motor;
			this.karosserie = karosserie;
			this.reifen = reifen;
		}
	}
	public Auto(int leistung) {
		this.motor = new Motor(leistung, 6, 1250);
		this.karosserie = new Karosserie(false, false, null);
		this.reifen = new Reifen(null, null, 0);
	}
	@Override
	public String toString() {
		return "Auto [getMotor()=" + getMotor() + ", getKarosserie()=" + getKarosserie() + ", getReifen()="
				+ getReifen() + "]";
	}
	
	
}
