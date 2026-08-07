package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Persona;

class personaTest {

	@Test
	void estaenMaravillaTest_true() {
		Persona p1 = new Persona(0, 0, 0);
		p1.setDondeseUbica(-10);
		// assertEquals ("valor esperado", "valor obtenido");
		
		assertEquals(true, p1.estaenMaravilla());
	}
	
	@Test
	void estaenMaravillaTest_false() {
		Persona p1 = new Persona(0, 0, 0);
	
		assertEquals(false, p1.estaenMaravilla());
	}
	@Test
	void ubicacion9test() {
		Persona p1 = new Persona(0, 0, 0);
		assertEquals(0, p1.getDondeseUbica());
	}
	//A la hora de testear un void se checkean todas las variables que modifica.
	@Test
	void embellecertest() {
		Persona p1 = new Persona(0, 0, 0);
		
		p1.setLocura(50);
		p1.setSecretos(100);
		
		p1.Embellecer(20);
		
		//Cuando son más de dos datos, se usan la cantidad de asserEquals necesarias PERO se espera que todas sean correctas
		assertEquals(90, p1.getSecretos());
		assertEquals(70, p1.getLocura());
		
	}
	@Test
	void esLindoTest_true() {
		Persona p1 = new Persona();
		p1.setLocura(99);
		p1.setDondeseUbica(-67);
		
		assertEquals(true, p1.esLindo());
	}
	@Test
	void esLindoTest_false() {
		Persona p1 = new Persona();
		p1.setDondeseUbica(30);
		p1.setLocura(67);
		
		assertEquals(false, p1.esLindo());
	}
}
