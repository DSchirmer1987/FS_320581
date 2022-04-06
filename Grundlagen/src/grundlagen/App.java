package grundlagen;

import grundlagen.classes.Kuh;

public class App {

	public static void main(String[] args) {
		Kuh berta = new Kuh();
		Kuh elfriede = new Kuh("Elfriede", "braun-weiﬂ", 561);
		System.out.println(berta);
		System.out.println(elfriede);
	}

}
