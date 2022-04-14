package quizmaster_dozent.model.spiel;

import java.util.ArrayList;

public class Gewinntabelle {
	private ArrayList<Stufe> stufen;

	public ArrayList<Stufe> getStufen() {
		return stufen;
	}

	public void setStufen(ArrayList<Stufe> stufen) {
		this.stufen = stufen;
	}
	
	public Gewinntabelle(int anzahlStufen) {
		this.setStufen(new ArrayList<Stufe>());
		this.getStufen().add(new Stufe(1, false, 50));
		for(int i = 2; i <= anzahlStufen; i++) {
			this.getStufen().add(new Stufe(i, false, this.getStufen().get(i-2).getBetrag() * 2));
			if(i % 5 == 0) {
				this.getStufen().get(i-1).setSafezone(true);
			}
			switch(i) {
				case 4: {
					this.getStufen().get(i-1).setBetrag(300);
					break;
				}
				case 5: {
					this.getStufen().get(i-1).setBetrag(500);
					break;
				}
				case 13:{
					this.getStufen().get(i-1).setBetrag(125000);
					break;
				}
				case 14:{
					this.getStufen().get(i-1).setBetrag(500000);
					break;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Gewinntabelle [getStufen()=" + getStufen() + "]";
	}
	
	
}
