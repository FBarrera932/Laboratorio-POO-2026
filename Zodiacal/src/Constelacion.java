
public class Constelacion {
	private int distanciaSol;
	private boolean bandaCeleste;
	
	
	public Constelacion(int distanciaSol, boolean bandaCeleste) {
		this.distanciaSol = distanciaSol;
		this.bandaCeleste = bandaCeleste;
	}
	
	public boolean estaenCeleste() {
		if (setbandaCeleste(true)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cercanoalSol() {
		if (distanciaSol < 1000000000) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean getbandaCeleste() {
		return bandaCeleste;
	}

	public boolean setbandaCeleste(boolean bandaCeleste) {
		return this.bandaCeleste = bandaCeleste;
	}
	
	
	


}
