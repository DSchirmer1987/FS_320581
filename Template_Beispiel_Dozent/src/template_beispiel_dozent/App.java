package template_beispiel_dozent;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {	
		Stall<Kuh> kuhstall = new Stall<Kuh>();
		Stall<Tiere> tierstall = new Stall<Tiere>();
		Tiere tier = Tiere.Kuh;
		
		Kuh k1 = new Kuh();
		Kuh k2 = new Kuh();
		Kuh k3 = new Kuh();
		
		Schwein s1 = new Schwein();
		Schwein s2 = new Schwein();
		Schwein s3 = new Schwein();
		
		kuhstall.hinzufuegen(k1);
//		kuhstall.hinzufuegen(s1);
		
		tierstall.hinzufuegen(Tiere.Kuh);
	}

}
