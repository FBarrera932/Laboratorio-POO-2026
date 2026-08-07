package vacas;

public class Vaca {
	private int capacidad;
	private Razas raza;
	private int capacidadIntrinseca;
	
	
	public Vaca(int capacidad, Razas raza,  int capacidadIntrinseca) {
		this.capacidad = capacidad;
		this.raza = raza;
		this.capacidadIntrinseca = capacidadIntrinseca;
	}
	
	
	
	public int producirLeche() {
		return capacidadIntrinseca * raza.multiProduccion;
	}
	
	
	public void mugir() {
		
		System.out.println("MUUU");
	}
	
	
	public Razas getRaza() {
		return raza;
	}

	public void setRaza(Razas raza) {
		this.raza = raza;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCapacidadIntrinseca() {
		return capacidadIntrinseca;
	}



	public void setCapacidadIntrinseca(int capacidadIntrinseca) {
		this.capacidadIntrinseca = capacidadIntrinseca;
	}
	
}
