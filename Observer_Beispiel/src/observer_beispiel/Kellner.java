package observer_beispiel;

import java.util.Observable;
import java.util.Observer;

public class Kellner implements Observer{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kellner(String name) {
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return "Kellner [getName()=" + getName() + "]";
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(this.getName() + " hörte den Aufruf nach einem Kellner!");
		
		
	}

}
