package vacas;

public class Tambo {
	
	private int Superficie;
	private Vaca[] vacas;
	private float Capacidad = Superficie/2;
	private int Produccion;
	
	public Tambo(int Superficie, Vaca[] vacas, float Capacidad, int Produccion) {
		this.Superficie = Superficie;
		this.setVacas(vacas);
		this.Capacidad = Capacidad;
		this.Produccion = Produccion;
	}

	//Método 
	public Vaca VacamasProductora() {
		Vaca vacasuperProductora = vacas[0]; 
		for(Vaca v: vacas) {
			if(v.producirLeche() < vacasuperProductora.producirLeche()) {
				vacasuperProductora = v;
			}
		}
		return vacasuperProductora;
	}
	

	
	public float getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(float capacidad) {
		Capacidad = capacidad;
	}

	public int getProduccion() {
		return Produccion;
	}
	
	public void setProduccion(int produccion) {
		Produccion = produccion;
	}


	public Vaca[] getVacas() {
		return vacas;
	}


	public void setVacas(Vaca[] vacas) {
		this.vacas = vacas;
	}

	
	
}