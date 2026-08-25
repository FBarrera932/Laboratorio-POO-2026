package muebles.ejercicio;

import enumeradores.Calidad;
import enumeradores.Material;
import enumeradores.habilidades.Habilidad;
import muebles.MuebleEjercicio;
import principal.Jugador;
import util.Posicion;
import util.Util;

public final class Pesa extends MuebleEjercicio{

	private float peso;
	
	public Pesa(Posicion pos, String nombre, Material materialPrincipal, Calidad calidad, int puntosEntrenamiento,
			int peso) {
		super(pos, nombre, materialPrincipal, calidad, Habilidad.FUERZA);

	}
	
	public void usar(Jugador jugador) {
		float mejoramiento = (multiplicadorCalidad * 1) + peso;
		System.out.println("usado pesa");
		jugador.setFuerza(1);
		//mejorar habilidad ¿como?
		//reducir energia¿como?
	}

	
	
}
