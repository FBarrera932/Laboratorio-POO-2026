package sate;

public abstract class Satelite {
	
	 protected String metodoDePropulsion;
	 protected int cantAntenas;
	 protected double capacidadCarga;
	 protected Posicion posicion;
	 protected int masaBase;
	 protected TipoPanel panel;
	 
	 public String getMetodoDePropulsion() {
		return metodoDePropulsion;
	}
	public void setMetodoDePropulsion(String metodoDePropulsion) {
		this.metodoDePropulsion = metodoDePropulsion;
	}
	public int getCantAntenas() {
		return cantAntenas;
	}
	public void setCantAntenas(int cantAntenas) {
		this.cantAntenas = cantAntenas;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public int getMasaBase() {
		return masaBase;
	}
	public void setMasaBase(int masaBase) {
		this.masaBase = masaBase;
	}
	public TipoPanel getPanel() {
		return panel;
	}
	public void setPanel(TipoPanel panel) {
		this.panel = panel;
	}
	public Satelite(String metodoDePropulsion, int cantAntenas, double capacidadCarga, Posicion posicion, int masaBase,
			TipoPanel panel) {
		super();
		this.metodoDePropulsion = metodoDePropulsion;
		this.cantAntenas = cantAntenas;
		this.capacidadCarga = capacidadCarga;
		this.posicion = posicion;
		this.masaBase = masaBase;
		this.panel = panel;
	}
	public int masaActual() {
		 return masaBase+(cantAntenas*20)+ 600;
	 }
	 public abstract double cargarEnergia();
	 
	 public double multiPanel() {
			if(panel==TipoPanel.ANTIPARALELO) {
				return 1;
			}
			if(panel==TipoPanel.BIORESPANSIVAS) {
				return 1.4f;
			}
			if(panel==TipoPanel.PSEUDOTRANSFERENCIA) {
				return 1.8f;
			}
			else {
				return 0.7F;
			}
		}
	 public int distanciaAlCentroDeLaTierra() {
		 return posicion.getZ()+6378;
	 }
	 public double generarCiencia() {
		 return 10*(capacidadCarga/3000000000f);
	 }
	 public boolean estaHibernando() {
		 return capacidadCarga<600000000f*0.2f;
	 }
}
