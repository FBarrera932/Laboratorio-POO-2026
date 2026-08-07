
public class Carrera {
	private Caballo[] caballos = new Caballo[10];
	
	private int velocidadProm = 0;
	private int explosividadProm = 0;
	private int experienciaProm = 0;
	private int resistenciaProm = 0;
	private int suerteProm = 0;
	private int Auxiliar = 0;
	
	public Carrera() {
	}
	
	
	public void cargarCaballos(Caballo caballo) {
		caballos[Auxiliar]= caballo;
		Auxiliar ++;
	}
	
	
	public void sacarPromedio() {
		if (Auxiliar == 10) {
			for (Caballo c: caballos) {
				velocidadProm += c.getVelocidad();
				explosividadProm += c.getExplosividad();
				experienciaProm += c.getExperiencia();
				resistenciaProm += c.getResistencia();
				suerteProm += c.getSuerte();
			}
		}
		velocidadProm = velocidadProm/caballos.length;
		explosividadProm = explosividadProm/caballos.length;
		experienciaProm = experienciaProm/caballos.length;
		resistenciaProm = resistenciaProm/caballos.length;
		suerteProm = suerteProm/caballos.length;
	}
	
	public boolean esApostable(Caballo caballo) {
		if(caballo.getfueAlimentado()) {
			return((caballo.getVelocidad()-50) > velocidadProm &&
			caballo.getExplosividad() > explosividadProm &&
			caballo.getExperiencia() > experienciaProm &&
			caballo.getResistencia() > resistenciaProm &&
			caballo.getSuerte() > suerteProm);
		}
		else {
			return(caballo.getVelocidad() > velocidadProm &&
					caballo.getExplosividad() > explosividadProm &&
					caballo.getExperiencia() > experienciaProm &&
					caballo.getResistencia() > resistenciaProm &&
					caballo.getSuerte() > suerteProm);
		}
	}


	
	
}
