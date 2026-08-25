package menues;

import java.util.ArrayList;

import enumeradores.Calidad;
import enumeradores.Material;
import muebles.Mueble;
import muebles.MuebleEjercicio;
import muebles.ejercicio.EquipoDeGimnasio;
import muebles.ejercicio.Pesa;
import principal.Jugador;
import util.Util;

public class MenuGimnasio {

	
	private ArrayList<MuebleEjercicio> muebles = new ArrayList<>();//Quiero tener un solo gran array de muebles de ejercicio. Me pregunto si esto me dara algun problema en el futuro...
	
	//ArrayList<Pesa> pesas = new ArrayList<>();//es una opcion... pero no me encanta...

	public MenuGimnasio() {
		muebles.add(new Pesa(null, "Pesa 25Kg", Material.METAL, Calidad.BUENA, 1, 23));
	}
	
	public void mostrar() {
		
		System.out.println("Que equipo usar?");
		
		for(int i = 0; i<muebles.size();i++) {
			System.out.println((i+1)+")"+ muebles.get(i).getNombre());

		}
		int ingresado = Util.ingresarEntero(1, muebles.size()+1);
		

		
		//OBJETIVO MANTENIENDO ESTA LINEA, MODIFICAR EL VALOR DEL JUGADOR
		muebles.get(ingresado-1).usar(j);//UY!
		
		
		
//		System.out.println("Que equipo usar?");
//		
//		for(int i = 0; i<EquipoDeGimnasio.values().length;i++) {
//			System.out.println((i+1)+")"+ EquipoDeGimnasio.values()[i]);
//		}
//		
//		int ingresado = u.ingresarEntero(1, muebles.size()+1);
//		System.out.println(ingresado);
//		switch (ingresado) {
//		case 1: {
//			imprimirMenuEquipo(muebles, EquipoDeGimnasio.PESA);
//		}
//		
//	}
	
}

	private void imprimirMenuEquipo(ArrayList<MuebleEjercicio> equipo, EquipoDeGimnasio tipo) {
		
		System.out.println("Seleccione equipo");
		for(int i = 0;i<equipo.size();i++) {
			System.out.println((i+1)+")"+ equipo.get(i).getNombre());
		}
		int ingresado = u.ingresarEntero(1, equipo.size()+1);
		switch (tipo) {
		case PESA: {
			Pesa p = (Pesa) equipo.get(ingresado-1);
			//p.usar();
		}
		default:
		}
	}
	
}
