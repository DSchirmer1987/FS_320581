package woerterbuchh_dozent;

public class DictionaryEntry {
	private String german;
	private String english;
	
	public String getGerman() {
		return german;
	}
	public void setGerman(String german) {
		this.german = german;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	
	public DictionaryEntry(String german, String english) {
		super();
		this.german = german;
		this.english = english;
	}
	@Override
	public String toString() {
		return "DictionaryEntry [getGerman()=" + getGerman() + ", getEnglish()=" + getEnglish() + "]";
	}
	
	
}
