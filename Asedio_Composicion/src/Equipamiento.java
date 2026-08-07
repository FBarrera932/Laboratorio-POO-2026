
public class Equipamiento {
	private int Defensa;
	private int Rareza;
	private int Precio;
	private int Durabilidad;
	
	
	public Equipamiento(int Defensa, int Rareza, int Precio, int Durabilidad) {
		this.Defensa = Defensa;
		this.Rareza = Rareza;
		this.Precio = Precio;
		this.Durabilidad = Durabilidad;
	}
	

	public boolean Legendario() {
		if (Rareza == 10 && Precio == 5000000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean Defensivo() {
		if(Defensa > 1000) {
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean Ofensivo() {
		if (Defensa < 50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean Comun() {
		if(Rareza < 3 && Durabilidad == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int getDefensa() {
		return Defensa;
	}

	public void setDefensa(int defensa) {
		Defensa = defensa;
	}

	public int getRareza() {
		return Rareza;
	}

	public void setRareza(int rareza) {
		Rareza = rareza;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public int getDurabilidad() {
		return Durabilidad;
	}

	public void setDurabilidad(int durabilidad) {
		Durabilidad = durabilidad;
	}
	
}
