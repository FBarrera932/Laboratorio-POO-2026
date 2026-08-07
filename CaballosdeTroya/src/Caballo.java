
public class Caballo {
	private int Velocidad;
	private int Explosividad;
	private int Experiencia;
	private int Resistencia;
	private int Suerte;
	
	private boolean fueAlimentado;
	private boolean fueIntimidado;
	
	public Caballo(int Velocidad, int Explosividad, int Experiencia, int Resistencia, int Suerte, boolean fueAlimentado, boolean fueIntimidado) {
		this.Velocidad = Velocidad;
		this.Explosividad = Explosividad;
		this.Experiencia = Experiencia;
		this.Resistencia = Resistencia;
		this.Suerte = Suerte;
		this.fueAlimentado = fueAlimentado;
		this.fueIntimidado = fueIntimidado;
	}
	public int getVelocidad() {
		return Velocidad;
	}
	public void setVelocidad(int Velocidad) {
		this.Velocidad = Velocidad;
	}
	public int getExplosividad() {
		return Explosividad;
	}
	public void setExplosividad(int Explosividad) {
		this.Explosividad = Explosividad;
	}
	public int getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(int Experiencia) {
		this.Experiencia = Experiencia;
	}
	public int getResistencia() {
		return Resistencia;
	}
	public void setResistencia(int Resistencia) {
		this.Resistencia = Resistencia;
	}
	public int getSuerte() {
		return Suerte;
	}
	public void setSuerte(int Suerte) {
		this.Suerte = Suerte;
	}
	public boolean getfueAlimentado() {
		return fueAlimentado;
	}
	public void setfueAlimentado(boolean fueAlimentado) {
		this.fueAlimentado = fueAlimentado;
	}
	public boolean getfueIntimidado() {
		return fueIntimidado;
	}
	public void setfueIntimidado(boolean fueIntimidado) {
		this.fueIntimidado = fueIntimidado;
	}

}
