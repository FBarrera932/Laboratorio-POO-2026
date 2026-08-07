
public class Persona {
	private int minutosEspera;
	private int precioPasaje;
	private boolean compromiso;

	
	public Persona(int minutosEspera, int precioPasaje, boolean compromiso) {
		this.setCompromiso(compromiso);
		this.setMinutosEspera(minutosEspera);
		this.setPrecioPasaje(precioPasaje);
		
	}
	public Persona() {
		
	}
	public int getMinutosEspera() {
		return minutosEspera;
	}
	public void setMinutosEspera(int minutosEspera) {
		this.minutosEspera = minutosEspera;
	}
	public int getPrecioPasaje() {
		return precioPasaje;
	}
	public void setPrecioPasaje(int precioPasaje) {
		this.precioPasaje = precioPasaje;
	}
	public boolean isCompromiso() {
		return compromiso;
	}
	public void setCompromiso(boolean compromiso) {
		this.compromiso = compromiso;
	}
	
	
	

	
}
