
public class App {

	public static void main(String[] args) {
	Caballo Juan = new Caballo(365, 6, 10, 2, 2, true, true);
	Caballo Kevin = new Caballo(67, 9, 24, 3, 3, true, false);
	Caballo Esteban = new Caballo(211, 7, 5, 4, 1, true, false);
	Caballo Eustaquio = new Caballo(400, 6, 10, 3, 2, false, true);
	Caballo Felipe = new Caballo(399, 5, 20, 0, 1, false, true);
	Caballo Androide17 = new Caballo(499, 9, 25, 4, 3, false, false);
	Caballo Patricio = new Caballo(100, 0, 14, 4, 3, true, true);
	Caballo Sardinilla = new Caballo(370, 5, 20, 4, 3, false ,false);
	Caballo Pereira = new Caballo(99, 4, 7, 2, 2, true, true);
	Caballo Rita = new Caballo(333, 6, 12, 4, 3, false, false);
	
	
	Carrera Larural = new Carrera();
	Larural.cargarCaballos(Juan);
	Larural.cargarCaballos(Kevin);
	Larural.cargarCaballos(Esteban);
	Larural.cargarCaballos(Eustaquio);
	Larural.cargarCaballos(Felipe);
	Larural.cargarCaballos(Androide17);
	Larural.cargarCaballos(Patricio);
	Larural.cargarCaballos(Sardinilla);
	Larural.cargarCaballos(Pereira);
	Larural.cargarCaballos(Rita);
	
	Larural.sacarPromedio();
	
	/*for(Caballo c: Larural.cargarCaballos()) {
		
		System.out.println(c.esApostable(c));
	}*/
}
	

}
