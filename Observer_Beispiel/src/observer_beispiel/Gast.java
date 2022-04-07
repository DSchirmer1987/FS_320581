package observer_beispiel;

import java.util.Observable;

public class Gast extends Observable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Gast(String name) {
		this.setName(name);
	}

	@Override
	public String toString() {
		return "Gast [getName()=" + getName() + "]";
	}
	
	public void notify(Object signal) {
		setChanged();
		notifyObservers(signal);
	}
	
	public void kellnerRufen() {
		System.out.println(this.getName() + " ruft nach einem Kellner!");
		notify("Kellner!");
	}
}
