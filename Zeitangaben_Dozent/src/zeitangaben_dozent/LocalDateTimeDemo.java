package zeitangaben_dozent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
	private int tag;
	private int monat;
	private int jahr;
	private int stunde;
	private int minute;
	private int sekunde;
	private int nano;
	private LocalDate datum;
	private LocalTime zeit;
	private LocalDateTime datumzeit;
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getMonat() {
		return monat;
	}
	public void setMonat(int monat) {
		this.monat = monat;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	public int getStunde() {
		return stunde;
	}
	public void setStunde(int stunde) {
		this.stunde = stunde;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSekunde() {
		return sekunde;
	}
	public void setSekunde(int sekunde) {
		this.sekunde = sekunde;
	}
	public int getNano() {
		return nano;
	}
	public void setNano(int nano) {
		this.nano = nano;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public LocalTime getZeit() {
		return zeit;
	}
	public void setZeit(LocalTime zeit) {
		this.zeit = zeit;
	}
	public LocalDateTime getDatumzeit() {
		return datumzeit;
	}
	public void setDatumzeit(LocalDateTime datumzeit) {
		this.datumzeit = datumzeit;
	}
	
	public LocalDateTimeDemo(int jahr, int monat, int tag, int stunde, int minute, int sekunde, int nano) {
		this.setJahr(jahr);
		this.setMonat(monat);
		this.setTag(tag);
		this.setStunde(stunde);
		this.setMinute(minute);
		this.setSekunde(sekunde);
		this.setNano(nano);
		
		this.setDatum(LocalDate.of(jahr, monat, tag));
		this.setZeit(LocalTime.of(stunde, minute, sekunde, nano));
		this.setDatumzeit(LocalDateTime.of(jahr, monat, tag, stunde, minute, sekunde, nano));
	}
	
	public LocalDateTimeDemo(LocalDate datum, LocalTime zeit) {
		this.setDatumzeit(LocalDateTime.of(datum, zeit));
	}
	
	public LocalDateTimeDemo() {
		this.setDatumzeit(LocalDateTime.now());
	}
}
