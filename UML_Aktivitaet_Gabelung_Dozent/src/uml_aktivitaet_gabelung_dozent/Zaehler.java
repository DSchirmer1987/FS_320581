package uml_aktivitaet_gabelung_dozent;

public class Zaehler extends Thread{
	private int zahl;

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public Zaehler(int zahl, String name) {
		super(name);
		this.setZahl(zahl);
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= zahl; i++) {
			System.out.println(this.getName() + " : " + i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
