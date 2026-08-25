package muebles;

import enumeradores.Calidad;
import enumeradores.Material;
import principal.Jugador;
import util.Posicion;

public abstract class Mueble {

	private Posicion pos;
	private String nombre;
	private Material materialPrincipal;
	protected Calidad calidad;
	//private Zona zonaDeLaCasa;
	
	public Mueble(Posicion pos, String nombre, Material materialPrincipal, Calidad calidad) {
		this.pos = pos;
		this.nombre = nombre;
		this.materialPrincipal = materialPrincipal;
		this.calidad = calidad;
	}
	
	protected void mover(Posicion pos) {
		this.pos = pos;
	}
	
	protected void mover(float x, float y, float z) {
		this.pos = new Posicion(x,y,z);
	}
	
	public abstract void usar(Jugador jugador);
	
	public String getNombre() {
		return nombre;
	}
}
