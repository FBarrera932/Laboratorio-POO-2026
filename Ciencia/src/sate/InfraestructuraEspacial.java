package sate;

import java.util.ArrayList;

public class InfraestructuraEspacial {
	private final static int capacidadSatelites=1000;
	private ArrayList<Satelite> satelitesActivos;
	public InfraestructuraEspacial() {
		satelitesActivos=new ArrayList<Satelite>();
		cargarSatelites();
	}
	public void cargarSatelites() {
		for(int i=0; i<15;i++) {
			satelitesActivos.add(new Pampa32("", 1, 1, new Posicion(1,1,1), 500, TipoPanel.ANTIPARALELO));
		}
		for(int z=0; z<6;z++) {
			satelitesActivos.add(new Chacra("", 1, 1, new Posicion(1,1,1), 500, TipoPanel.ANTIPARALELO));
		}
		for(int z=0; z<17;z++) {
			satelitesActivos.add(new Austral("", 1, 1, new Posicion(1,1,1), 500, TipoPanel.ANTIPARALELO, 1));
		}
	}
	
	public void agregarSatelitePampa(Pampa32 valor) {
		satelitesActivos.add(valor);
	}
	public void agregarSateliteChacra(Chacra valor) {
		satelitesActivos.add(valor);
	}
	public void agregarSateliteAustral(Austral valor) {
		satelitesActivos.add(valor);
	}
	public double calcularEnergiaTotal(){
		double aux=0;
		for(Satelite x:satelitesActivos) {
			aux=aux+x.getCapacidadCarga();
		}
		return aux;
	}
	public ArrayList<Satelite> enHibernacion(){
		ArrayList<Satelite> sateliteszz = new ArrayList<Satelite>();
		for(Satelite x:satelitesActivos) {
			if(x.estaHibernando()) {
				sateliteszz.add(x);
			}
		}
		return sateliteszz;
	}
}
