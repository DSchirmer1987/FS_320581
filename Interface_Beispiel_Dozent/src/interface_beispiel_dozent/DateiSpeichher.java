package interface_beispiel_dozent;

public class DateiSpeichher implements Speicher{
	private String dateiname;

	public String getDateiname() {
		return dateiname;
	}

	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}

	public DateiSpeichher(String dateiname) {
		super();
		this.dateiname = dateiname;
	}

	@Override
	public String toString() {
		return "DateiSpeichher [getDateiname()=" + getDateiname() + "]";
	}
	
	public void dateiSpeichern() {
		System.out.println(this.dateiname + " wird gespeichert.");
	}
	
	public void dateiLaden() {
		System.out.println(this.dateiname + " wird geladen");
	}

	@Override
	public void speichern() {
		this.dateiSpeichern();
		
	}

	@Override
	public void laden() {
		this.dateiLaden();
		
	}
}
