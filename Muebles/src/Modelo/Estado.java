package Modelo;

public enum Estado {
	NUEVONUEVITO(0),
	USANDO(5),
	MOVIENDO(10),
	QUIETO(0), 
	COCHINO(75), 
	ROTIDO(100);
	
	int cantidaddeUsos;
	
	Estado(int cantidaddeUsos) {
		this.cantidaddeUsos = cantidaddeUsos;
	}
}