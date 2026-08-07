import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

	@Test
	void esNovato_true() {
		Jugador j1 = new Jugador();
		j1.setNivel(5);
		j1.setAñosExp(0);
		assertEquals(true, j1.esNovato());
 	}
	
	@Test
	void esNovato_false() {
		Jugador j1 = new Jugador();
		j1.setNivel(40);
		j1.setAñosExp(2);
		assertEquals(false, j1.esNovato());
 	}
	
	@Test
	void esVeterano_true() {
		Jugador j1 = new Jugador();
		j1.setNivel(100);
		j1.setAñosExp(10);
		assertEquals(true, j1.esVeterano());
 	}
	
	@Test
	void esVeterano_false() {
		Jugador j1 = new Jugador();
		j1.setNivel(5);
		j1.setAñosExp(0);
		j1.setArmadura(j1.e2);
		assertEquals(false, j1.esVeterano());
 	}
	
	@Test
	void paytoWin_true() {
		Jugador j1 = new Jugador();
		j1.setAñosExp(1);
		j1.setArmadura(j1.e2);
		
		assertEquals(true, j1.paytoWin());
 	}
	
	@Test
	void paytoWin_false() {
		Jugador j1 = new Jugador();
		j1.setAñosExp(5);
		j1.setArmadura(j1.e2);
		
		assertEquals(false, j1.paytoWin());
	}
	
	@Test
	void esTanque_true() {
		Jugador j1 = new Jugador();
		j1.setArmadura(j1.e1);
		
		assertEquals(true, j1.esTanque());
	}
	
	@Test
	void esTanque_false() {
		Jugador j1 = new Jugador();
		j1.setArmadura(j1.e3);
		
		assertEquals(false, j1.esTanque());
	}
	
	@Test
	void glassCanon_true() {
		Jugador j1 = new Jugador();
		j1.setArmadura(j1.e2);
		
		assertEquals(true, j1.glassCanon());
	}
	
	@Test
	void glassCanon_false() {
		Jugador j1 = new Jugador();
		j1.setArmadura(j1.e1);
		
		assertEquals(false, j1.glassCanon());
	}
	
	@Test
	void estaComplicado_true() {
		Jugador j1 = new Jugador();
		j1.setEconomia(1);
		j1.setArmadura(j1.e3);
		
		assertEquals(true, j1.estaComplicado());
	}
	
	@Test
	void estaComplicado_false() {
		Jugador j1 = new Jugador();
		j1.setEconomia(1000000);
		j1.setArmadura(j1.e2);
		
		assertEquals(false, j1.estaComplicado());
	}
	
	@Test
	void esNinja_true() {
		Jugador j1 = new Jugador();
		j1.setclase(Clase.NINJA);
		
		assertEquals(true, j1.esNinja());
	}
	
	@Test
	void esNinja_false() {
		Jugador j1 = new Jugador();
		j1.setclase(Clase.STRIKER);
		
		assertEquals(false, j1.esNinja());
	}
	
	@Test
	void esStriker_true() {
		Jugador j1 = new Jugador();
		j1.setclase(Clase.STRIKER);
		
		assertEquals(true, j1.esStriker());
	}
	
	@Test
	void esStriker_false() {
		Jugador j1 = new Jugador();
		j1.setclase(Clase.NINJA);
		
		assertEquals(false, j1.esStriker());
	}
	
	@Test
	void sinAsignar_true() {
		Jugador j1 = new Jugador();
		j1.setclase(Clase.SINASIGNAR);
		
		assertEquals(true, j1.sinAsignar());
	}
	
	@Test
	void sinAsignar() {
		Jugador j1 = new Jugador();
		j1.setclase(Clase.NINJA);
		
		assertEquals(false, j1.sinAsignar());
	}
	
}