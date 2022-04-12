package woerterbuchh_dozent;

public class App {

	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		
		dict.addEntry("Kaffe", "coffee");
		dict.addEntry("Bier", "beer");
		dict.addEntry("Pause", "break");
		
		
		System.out.println(dict);
		dict.sortGerman();
		System.out.println(dict);
		System.out.println(dict.translateToGerman("beers"));
	}

}
