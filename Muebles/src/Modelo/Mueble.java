package Modelo;

public abstract class  Mueble {
	private float posicionX;
	private float posicionY;
	private float posicionZ;
	private float vida;
	private String materialCompuesto;
	private Nombre nombre;
	
	

	public Mueble(float posicionX, float posicionY, float posicionZ, String materialCompuesto, Nombre nombre, float vida) {
		this.materialCompuesto = materialCompuesto;
		this.nombre = nombre;
		this.setVida(vida);
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.posicionZ = posicionZ;
	} 
	
	public void usarMueble() {
		System.out.println("Usando...");
	}
	
	public void moverMueble() {
		System.out.println("Moviendo...");
	}
	public void ensuciarMueble() {
		System.out.println("Ensuciando...");
	}
	
	
	
	public float getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(float posicionX) {
		this.posicionX = posicionX;
	}
	public float getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(float posicionY) {
		this.posicionY = posicionY;
	}
	public float getPosicionZ() {
		return posicionZ;
	}
	public void setPosicionZ(float posicionZ) {
		this.posicionZ = posicionZ;
	}
	public String getMaterialCompuesto() {
		return materialCompuesto;
	}
	public void setMaterialCompuesto(String materialCompuesto) {
		this.materialCompuesto = materialCompuesto;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public float getVida() {
		return vida;
	}

	public void setVida(float vida) {
		this.vida = vida;
	}
	
	
	
	
}
