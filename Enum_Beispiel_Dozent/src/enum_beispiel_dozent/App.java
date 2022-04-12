package enum_beispiel_dozent;

public class App {

	public static void main(String[] args) {
		Land land = Land.Deutschland;
		Stadt stadt = Land.Deutschland.stadt();
		System.out.println(land);
		System.out.println(land.getVorwahl());
		
		for(Land landFor : Land.values()) {
			System.out.println(landFor + " Vorwahl: " + landFor.getVorwahl());
		}
		
		System.out.println(Land.values()[2]);
		
		System.out.println(land.toString());
		
	}

}
