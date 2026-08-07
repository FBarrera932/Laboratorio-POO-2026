
public class Jugador {
	private int Nivel;
	private int añosExp;
	private int Economia;
	private Clase clase;
	private Equipamiento Armadura;
	
	Equipamiento e1 = new Equipamiento (10005, 8, 1000000, 5000);
	Equipamiento e2 = new Equipamiento (10, 10, 9000000, 9000);
	Equipamiento e3 = new Equipamiento(50, 1, 10, 0);
	
	
	public Jugador(int Nivel, int añosExp, int Economia, Clase clase, Equipamiento Armadura) {
		this.Nivel = Nivel;
		this.añosExp = añosExp;
		this.Economia = Economia;
		this.clase = clase;
		this.Armadura = Armadura;
		
	}
	public Jugador(Equipamiento Armadura) {
		this.Armadura = Armadura;
	}
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	public boolean esTanque() {
		if(Armadura.Defensivo() == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean glassCanon() {
		if(Armadura.getDefensa() < 50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esNovato() {
		if(añosExp < 1 || Nivel < 15) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esVeterano() {
		if(añosExp > 5 || Nivel > 90) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean paytoWin() {
		if(añosExp < 2 || Armadura.Legendario()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean estaComplicado() {
		if(Economia < 10000 || Armadura.Comun()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esStriker() {
		if(clase == Clase.STRIKER) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esNinja() {
		if(clase == Clase.NINJA) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sinAsignar() {
		if(clase == Clase.SINASIGNAR) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean bienPreparao() {
		if(Nivel > 120 && Armadura.Legendario()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esAsesino() {
		if(clase == Clase.NINJA || (clase == Clase.STRIKER && bienPreparao() == true)) {
			return true;
		}
		else 
		{
			return false;
		}
	}

	public void setclase(Clase clase) {
		this.clase = clase;
	}
	
	public void setArmadura(Equipamiento Armadura) {
		this.Armadura = Armadura;
	}
	
	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int nivel) {
		Nivel = nivel;
	}

	public int getAñosExp() {
		return añosExp;
	}

	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}

	public int getEconomia() {
		return Economia;
	}

	public void setEconomia(int economia) {
		Economia = economia;
	}
	public Clase getclase(Clase clase){
		return clase;
	}
	
}
