package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class FixtureDemo {
	
	private static LocalDateDemo datum;
	private static LocalDateDemo datum2;
	
	// @BeforeAll -  Wird ausgeführt sobald die Testklasse ausgeführt wird - Einmalig
	@BeforeAll
	static void start() {
		datum = new LocalDateDemo();
		datum2 = new LocalDateDemo(datum.getTag(), datum.getMonat(), datum.getJahr());
	}
	
	
	// @Test - Testfall
	@Test
	void test() {
		assertEquals(datum2.getDatum(), datum.getDatum());
	}
}
