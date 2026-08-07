package Modelo;
import java.util.ArrayList;
public class Mundo {
	private ArrayList<Persona> losPersonajes = new ArrayList<>();
	
	public Mundo(ArrayList<Persona> losPersonajes) {
		this.losPersonajes = losPersonajes;
	}
	
	Persona Pedro = new Persona(0, 90, 100);
	Persona Afonso = new Persona(20, 90, 670);
	Persona Juan = new Persona(90, 0, 70);
	Persona Raul = new Persona(50, 90, 100);
	Persona Esteban = new Persona(30, 1, 40);
	Persona Quito = new Persona(70, 50, 50);
	
	// punto 1
	public boolean determinarNormal() {
		for(Persona p: losPersonajes) {
			if(p.esNormal()) {
				return true;
			}
		}
		return false;
	}
	//Desesperación...
	public int CuantosLindos() {
		int contador = 0;
		for (Persona p: losPersonajes) {
			if(p.esLindo() == true) {
				contador ++;
			}
		}
		return contador;
	}
	public int cuantosNormales() {
		int contador = 0;
		for (Persona p: losPersonajes) {
			if(p.esNormal() == true) {
				contador ++;
			}
		}
		return contador;
	}
	//punto 2
	public ArrayList<Persona> personajeslindos(){
		ArrayList<Persona> personajeslindos = new ArrayList<>();
		for (Persona p: losPersonajes) {
			if(p.esLindo() == true) {
				personajeslindos.add(p);
			}
		}
		return personajeslindos;
	}
	public ArrayList<Persona> personajesNormales(){
		ArrayList<Persona> personajesnormales = new ArrayList<>();
		for (Persona p: losPersonajes) {
			if(p.esNormal() == true) {
				personajesnormales.add(p);
			}
		}
		return personajesnormales;
	}

//punto 3
public int estaenMaravilla() {
	int contador = 0;
	for(Persona p: losPersonajes) {
		if(p.estaenMaravilla() == true) {
			contador ++;
		}
	}
	return contador;
}

//punto 4
public ArrayList<Persona> personaloca(){
	ArrayList<Persona> personaloca = new ArrayList<>();
	for(Persona p: losPersonajes) {
		if(p.getLocura() == p.getmaximoLocura()) {
			personaloca.add(p);
		}
	}
	return personaloca;
}

//punto 5

	public boolean maslindos() {
		for(Persona p: losPersonajes) {
			if(p.esLindo() != p.esNormal()) {
				return true;
			}
				
		}
	return false;
	}
}
		


