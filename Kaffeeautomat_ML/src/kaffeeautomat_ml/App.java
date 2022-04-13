package kaffeeautomat_ml;

public class App {

	public static void main(String[] args) {
		Kaffeeautomat ka = new Kaffeeautomat("Erdgeschoss");
////		System.out.println(ka.getKaffeesorten());
//		ka.printPreisliste();
//		ka.printAkzeptierteMuenzen();
		
		ka.sortenAuswahl();
	}

}
