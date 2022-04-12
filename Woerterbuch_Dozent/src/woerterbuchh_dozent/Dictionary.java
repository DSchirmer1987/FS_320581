package woerterbuchh_dozent;

import java.util.ArrayList;
import java.util.Comparator;

public class Dictionary {
	private ArrayList<DictionaryEntry> entries;

	public ArrayList<DictionaryEntry> getEntries() {
		return entries;
	}

	public void setEntries(ArrayList<DictionaryEntry> entries) {
		this.entries = entries;
	}

	public Dictionary() {
		this.setEntries(new ArrayList<DictionaryEntry>());
	}
	
	public void addEntry(DictionaryEntry entry) {
		this.getEntries().add(entry);
	}
	
	public void addEntry(String german, String english) {
		this.getEntries().add(new DictionaryEntry(german, english));
	}

	@Override
	public String toString() {
		return "Dictionary [getEntries()=" + getEntries() + "]";
	}
	
	public String translateToGerman(String english) {
		for(DictionaryEntry entry : this.getEntries()) {
			if(entry.getEnglish().equals(english)) {
				return entry.getGerman();
			}
		}
		return "Kein Wort gefunden.";
	}
	
	public String translateToEnglish(String german) {
		for(DictionaryEntry entry : this.getEntries()) {
			if(entry.getGerman().equals(german)) {
				return entry.getEnglish();
			}
		}
		return "Kein Wort gefunden.";
	}
	
	public void sortGerman() {
		entries.sort(Comparator.comparing(DictionaryEntry::getGerman));
	}
	
	public void sortEnglish() {
		entries.sort(Comparator.comparing(DictionaryEntry::getEnglish));
	}
}
