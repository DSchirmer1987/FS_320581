package uml_klassen_aggregatioKomposition_dozent.komposition;

public class Motor {
	private int leisung;
	private int zylinder;
	private int hubraum;
	public int getLeisung() {
		return leisung;
	}
	public void setLeisung(int leisung) {
		this.leisung = leisung;
	}
	public int getZylinder() {
		return zylinder;
	}
	public void setZylinder(int zylinder) {
		this.zylinder = zylinder;
	}
	public int getHubraum() {
		return hubraum;
	}
	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}
	public Motor(int leisung, int zylinder, int hubraum) {
		super();
		this.leisung = leisung;
		this.zylinder = zylinder;
		this.hubraum = hubraum;
	}
	@Override
	public String toString() {
		return "Motor [getLeisung()=" + getLeisung() + ", getZylinder()=" + getZylinder() + ", getHubraum()="
				+ getHubraum() + "]";
	}
	
	
}
