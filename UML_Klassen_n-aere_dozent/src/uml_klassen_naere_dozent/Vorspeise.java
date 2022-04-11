package uml_klassen_naere_dozent;

import java.util.ArrayList;

public class Vorspeise {
	private ArrayList<Menue> menues;

	public ArrayList<Menue> getMenues() {
		return menues;
	}

	private void setMenues(ArrayList<Menue> menues) {
		this.menues = menues;
	}
	
	public Vorspeise() {
		this.setMenues(new ArrayList<Menue>());
	}

	@Override
	public String toString() {
		return "Vorspeise [getMenues()=" + this.getMenues() + "]";
	}
	
	public void menueEintragen(Menue menue) {
		this.getMenues().add(menue);
	}
}
