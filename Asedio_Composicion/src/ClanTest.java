import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ClanTest {

	@Test
	void losVeteranos() {
		Jugador j1 = new Jugador();
		j1.setAñosExp(16);
		j1.setNivel(100);
		j1.sinAsignar();
		Jugador j2 = new Jugador();
		j2.setAñosExp(17);
		j2.setNivel(200);
		j2.sinAsignar();
		Jugador j3 = new Jugador();
		j3.setAñosExp(30);
		j3.setNivel(94);
		j3.sinAsignar();
		Jugador j4 = new Jugador();
		j4.setAñosExp(15);
		j4.setNivel(150);
		j4.sinAsignar();
		ArrayList<Jugador> losjugadores = new ArrayList<>();
		losjugadores.add(j1);
		losjugadores.add(j2);
		losjugadores.add(j3);
		losjugadores.add(j4);
		
		Jugador j5 = new Jugador();
		j5.setAñosExp(17);
		j5.setNivel(110);
		j5.sinAsignar();
		Jugador j6 = new Jugador();
		j6.setAñosExp(18);
		j6.setNivel(150);
		j6.sinAsignar();
		Jugador j7 = new Jugador();
		j7.setAñosExp(19);
		j7.setNivel(200);
		j7.sinAsignar();
		Jugador j8 = new Jugador();
		j8.setAñosExp(20);
		j8.setNivel(250);
		j8.sinAsignar();
		
		ArrayList<Jugador> jugadorenses = new ArrayList<>();
		jugadorenses.add(j5);
		jugadorenses.add(j6);
		jugadorenses.add(j7);
		jugadorenses.add(j8);
		Clan clAn1 = new Clan(jugadorenses);
		
		Clan clan1 = new Clan(losjugadores);
		assertEquals(clan1.losVeteranos(), clAn1.losVeteranos());
	}
	@Test
	void losnovatos() {
		Jugador J1 = new Jugador();
		J1.setAñosExp(0);
		J1.setNivel(1);
		J1.sinAsignar();
		Jugador J2 = new Jugador();
		J2.setAñosExp(0);
		J2.setNivel(2);
		J2.sinAsignar();
		Jugador J3 = new Jugador();
		J3.setAñosExp(0);
		J3.setNivel(1);
		J3.sinAsignar();
		Jugador J4 = new Jugador();
		J4.setAñosExp(0);
		J4.setNivel(10);
		J4.sinAsignar();
		
		ArrayList<Jugador> losjugadorotes = new ArrayList<>();
		losjugadorotes.add(J1);
		losjugadorotes.add(J2);
		losjugadorotes.add(J3);
		losjugadorotes.add(J4);
		
		Jugador J5 = new Jugador();
		J5.setAñosExp(0);
		J5.setNivel(5);
		J5.sinAsignar();
		Jugador J6 = new Jugador();
		J6.setAñosExp(0);
		J6.setNivel(11);
		J6.sinAsignar();
		Jugador J7 = new Jugador();
		J7.setAñosExp(0);
		J7.setNivel(2);
		J7.sinAsignar();
		Jugador J8 = new Jugador();
		J8.setAñosExp(0);
		J8.setNivel(2);
		J8.sinAsignar();
		
		ArrayList<Jugador> jugadoreanos = new ArrayList<>();
		jugadoreanos.add(J5);
		jugadoreanos.add(J6);
		jugadoreanos.add(J7);
		jugadoreanos.add(J8);
		Clan claN1 = new Clan(jugadoreanos);
		
		Clan cLan1 = new Clan(losjugadorotes);
		assertEquals(claN1.losNovatos(), cLan1.losNovatos());
	}
	@Test
	void losAsesinos() {
		Jugador j1 = new Jugador();
		j1.esAsesino();
		ArrayList<Jugador> jogadores = new ArrayList<>();
		jogadores.add(j1);
		Jugador J1 = new Jugador();
		J1.esAsesino();
		ArrayList<Jugador> players = new ArrayList<>();
		players.add(J1);
		Clan ClAn2 = new Clan(players);
		Clan Clan2 = new Clan(jogadores);
		assertEquals(Clan2.losAsesinos(), ClAn2.losAsesinos());
	}
	
	@Test
	void losTanques() {
		Jugador j1 = new Jugador();
		j1.esTanque();
		j1.sinAsignar();
		ArrayList<Jugador> juegadores = new ArrayList<>();
		juegadores.add(j1);
		Jugador J1 = new Jugador();
		j1.esTanque();
		j1.sinAsignar();
		ArrayList<Jugador> jugadorenios = new ArrayList<>();
		jugadorenios.add(J1);
		Clan clanete2 = new Clan(juegadores);
		Clan clarinete2 = new Clan(jugadorenios);
		
		assertEquals(clarinete2.losTanques(), clanete2.losTanques());
	}
	
	@Test
	void muchaPlata() {
		Jugador j1 = new Jugador();
		j1.paytoWin();
		j1.sinAsignar();
		ArrayList<Jugador> losjuegadores = new ArrayList<>();
		losjuegadores.add(j1);
		
		Jugador J1 = new Jugador();
		J1.paytoWin();
		j1.sinAsignar();
		ArrayList<Jugador> jugadoretes = new ArrayList<>();
		Clan clarin = new Clan(losjuegadores);
		Clan clarence = new Clan(jugadoretes);
		
		assertEquals(clarin.muchaPlata(), clarence.muchaPlata());
	}
	
	@Test
	void glassCanon() {
		Jugador j1 = new Jugador();
		j1.glassCanon();
		j1.sinAsignar();
		ArrayList<Jugador> losjogadores = new ArrayList<>();
		losjogadores.add(j1);
		
		Jugador J1 = new Jugador();
		J1.glassCanon();
		J1.sinAsignar();
		ArrayList<Jugador> losjuegadorenses = new ArrayList<>();
		losjuegadorenses.add(J1);
		
		Clan demagogia = new Clan(losjogadores);
		Clan KKK = new Clan(losjuegadorenses);
		
		assertEquals(demagogia.glassCanon(), KKK.glassCanon());
	}
}
