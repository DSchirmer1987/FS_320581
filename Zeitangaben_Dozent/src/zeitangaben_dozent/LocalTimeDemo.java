package zeitangaben_dozent;

import java.time.LocalTime;

public class LocalTimeDemo {
	private LocalTime uhrzeit;
	private int stunden;
	private int minuten;
	private int sekunden;
	private int millisekunden;
	public int getStunden() {
		return stunden;
	}
	public void setStunden(int stunden) {
		this.stunden = stunden;
	}
	public int getMinuten() {
		return minuten;
	}
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}
	public int getSekunden() {
		return sekunden;
	}
	public void setSekunden(int sekunden) {
		this.sekunden = sekunden;
	}
	public int getMillisekunden() {
		return millisekunden;
	}
	public void setMillisekunden(int millisekunden) {
		this.millisekunden = millisekunden;
	}
	public LocalTime getUhrzeit() {
		return uhrzeit;
	}
	
	public LocalTimeDemo() {
		// Jetztige Uhrzeit
		this.uhrzeit = LocalTime.now();
		
		// Holen von Stunden, Minuten, Sekunden und Millisekunden
		this.setStunden(this.uhrzeit.getHour());
		this.setMinuten(this.uhrzeit.getMinute());
		this.setSekunden(this.uhrzeit.getSecond());
		this.setMillisekunden(this.uhrzeit.getNano());
	}
	
	public LocalTimeDemo(int stunden, int minuten, int sekunden, int nano) {
		this.setStunden(stunden);
		this.setMinuten(minuten);
		this.setSekunden(sekunden);
		this.setMillisekunden(nano);
		
		// Aufbauen eine Uhrzeit aus den gegebenen Werten
		this.uhrzeit = LocalTime.of(stunden, minuten);
		this.uhrzeit = LocalTime.of(stunden, minuten, sekunden);
		this.uhrzeit = LocalTime.of(stunden, minuten, sekunden, nano);
	}
	
}
