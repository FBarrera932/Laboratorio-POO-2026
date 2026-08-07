package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Modelo.Mundo;
import Modelo.Persona;

class mundoTest {

	@Test
	void cuantospersonajesLindosTest() {
		Persona p1 = new Persona();
		p1.setLocura(80);
		p1.setDondeseUbica(-10);
		Persona p2 = new Persona();
		p2.setLocura(20);
		p2.setDondeseUbica(10);
		Persona p3 = new Persona();
		p3.setLocura(15);
		p3.setDondeseUbica(-10);
		Persona p4 = new Persona();
		p4.setLocura(100);
		p4.setDondeseUbica(-10);
		Persona p5 = new Persona();
		p5.setLocura(50);
		p5.setDondeseUbica(67);
		
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		Mundo mundeano = new Mundo(personas);
		
		assertEquals(2, mundeano.CuantosLindos());
			
	}
	@Test
	void PersonasnormalesTest() {
		Persona p1 = new Persona(50, -10, 100);
		Persona p2 = new Persona(10, -20, 500);
		Persona p3 = new Persona(80, -30, 700);
		Persona p4 = new Persona(100, 10, 990);
		Persona p5 = new Persona(0, 50, 750);
		
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		Mundo mundeano = new Mundo(personas);
		ArrayList<Persona> personasn = new ArrayList<>();
		
		personas.add(p4);
		personasn.add(p5);
		
		assertEquals(personasn, mundeano.personajesNormales());
	}

}
