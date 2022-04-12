package interface_beispiel_dozent;

public class DatenbankSpeicher implements Speicher{
	private String datenbankname;
	private String tabellenname;
	public String getDatenbankname() {
		return datenbankname;
	}
	public void setDatenbankname(String datenbankname) {
		this.datenbankname = datenbankname;
	}
	public String getTabellenname() {
		return tabellenname;
	}
	public void setTabellenname(String tabellenname) {
		this.tabellenname = tabellenname;
	}
	public DatenbankSpeicher(String datenbankname, String tabellenname) {
		super();
		this.datenbankname = datenbankname;
		this.tabellenname = tabellenname;
	}
	@Override
	public String toString() {
		return "DatenbankSpeicher [datenbankname=" + datenbankname + ", tabellenname=" + tabellenname + "]";
	}
	
	public void datenbankSpeichern() {
		System.out.println("Es wird in " + this.datenbankname + " gespeichert");
	}
	
	public void datenbankLaden() {
		System.out.println("Es wird aus " + this.datenbankname + " geladen");
	}
	@Override
	public void speichern() {
		this.datenbankSpeichern();
		
	}
	@Override
	public void laden() {
		this.datenbankLaden();
		
	}
}
