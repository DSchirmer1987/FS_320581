package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Multiplikation_Test {

	private Multiplikation multi = new Multiplikation();
	private LocalDateDemo demotest = new LocalDateDemo();
	private LocalDateDemo demotest2 = new LocalDateDemo();
	
	
	@Test
	void testMultipliziere() {
		// fail() - Wird definitiv ein Fehlschlag verursachen.
//		fail("Not yet implemented");
		
		assertEquals(25, multi.multipliziere(5, 5));
		
	}
	
	
	/*
	 * Bekomme ich ein Objekt zurück?
	 * 
	 * Welche Eigenschaften haben das Objekt?
	 */
	
	// Bekomme ich ein Objekt zurück?
	@Test
	void gibtEsEinObjekt() {
		assertTrue(demotest.getDatum() instanceof LocalDate);
	}
	
	// Sind Objekte gleich
	// assertEquals benutzt die equals() Methode in der jeweiligen Klasse
	@Test
	void istObjektGleich() {
		System.out.println(demotest2.getDatum() + " - " + demotest.getDatum());
		assertEquals(demotest2.getDatum(), demotest.getDatum());
	}
	
	// assertSame - prüft auf tatsächliche (Referenz) Gleichheit.
	@Test
	void istObjektGleichwertig() {
		assertSame(demotest2, demotest);
	}
}
