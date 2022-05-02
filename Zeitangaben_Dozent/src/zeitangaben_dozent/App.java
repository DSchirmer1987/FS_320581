package zeitangaben_dozent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		LocalDateDemo datum1 = new LocalDateDemo();
		LocalDateDemo datum2 = new LocalDateDemo(25, 8, 2000);
		System.out.println(datum1.getDatum());
		System.out.println(datum2.getDatum());
		System.out.println("-----");
		
		LocalTimeDemo zeit1 = new LocalTimeDemo();
		LocalTimeDemo zeit2 = new LocalTimeDemo(14, 51, 12, 500);
		System.out.println(zeit1.getUhrzeit());
		System.out.println(zeit2.getUhrzeit());
		System.out.println("-----");
		
		LocalDateTimeDemo datumzeit1 = new LocalDateTimeDemo();
		LocalDateTimeDemo datumzeit2 = new LocalDateTimeDemo(datum1.getDatum(), zeit2.getUhrzeit());
		System.out.println(datumzeit1.getDatumzeit());
		System.out.println(datumzeit2.getDatumzeit());
		System.out.println("-----");
		
		/*
		 * Datum und Zeitangaben formatieren
		 */
		// Anhand von Datum
		DateTimeFormatter iso = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter basic_iso = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter d_datum = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("Ohne Formatter: " + datum1.getDatum());
		System.out.println("ISO Formatter: " + datum1.getDatum().format(iso));
		System.out.println("Basic ISO Formatter: " + datum1.getDatum().format(basic_iso));
		System.out.println("Mit eigenem Pattern: " + datum1.getDatum().format(d_datum));
		System.out.println("-----");
		
		// Anhand von Uhrzeiten
		DateTimeFormatter iso_time = DateTimeFormatter.ISO_TIME;
		DateTimeFormatter d_time = DateTimeFormatter.ofPattern("HH:mm:ss , SSSS");
		System.out.println("Ohne Formatter: " + zeit1.getUhrzeit());
		System.out.println("ISO Formatter: " + zeit1.getUhrzeit().format(iso_time));
		System.out.println("Eigenes Pattern: " + zeit1.getUhrzeit().format(d_time));
		System.out.println("-----");
		
		// Anhand von Datum+Uhrzeit
		DateTimeFormatter iso_datetime = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter d_datetime = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm:ss");
		System.out.println("Ohne Formatter: " + datumzeit1.getDatumzeit());
		System.out.println("Mit ISO_DATE Formatter: " + datumzeit1.getDatumzeit().format(iso));
		System.out.println("Mit ISO_TIME Formatter: " + datumzeit1.getDatumzeit().format(iso_time));
		System.out.println("Mit ISO_DATE_TIME Formatter: " + datumzeit1.getDatumzeit().format(iso_datetime));
		System.out.println("Mit eigenem Pattern: " + datumzeit1.getDatumzeit().format(d_datetime));
		System.out.println("-----");
		
		// Spielereien mit DateTimeFormatter Pattern
		DateTimeFormatter spielpattern = DateTimeFormatter.ofPattern("'Heute ist der 'dd'. im 'MMMM");
		System.out.println("Ohne Formatter: " + datumzeit1.getDatumzeit());
		System.out.println("Mit Spielpattern: " + datumzeit1.getDatumzeit().format(spielpattern));
		System.out.println("-----");
		
		// Formatter mit Locale
		DateTimeFormatter de_datum = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy", Locale.GERMAN);
		DateTimeFormatter fr_datum = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy", Locale.FRENCH);
		System.out.println("Ohne Formatter: " + datum1.getDatum());
		System.out.println("Mit de_Datum: " + datum1.getDatum().format(de_datum));
		System.out.println("Mit fr_datum: " + datum1.getDatum().format(fr_datum));
		System.out.println("-----");
		
		/*
		 * Rechnen mit Zeitangaben (Date, Time und DateTime)
		 */
		LocalTime start = LocalTime.of(11, 15);
		System.out.println("Pause von: " + start + " bis " + start.plusMinutes(15));
		LocalDate start_datum = LocalDate.of(2022, 5, 3);
		System.out.println("Wir warten von: " + start_datum + " bis " + start_datum.plusDays(3));
		LocalDateTime heute = LocalDateTime.now();
		System.out.println(heute.plusHours(25));
	}

}
