package menues;

import principal.Jugador;
import util.Util;

public class Menu {


	private MenuGimnasio mG ;
	
	public Menu() {
		mG = new MenuGimnasio();
	}
	
	public void mostrarInicial() {
		System.out.println("Bienvendio a la casa");
		
		System.out.println("1) Ir al dormitorio");
		System.out.println("2) Ir a la cocina");
		System.out.println("3) Ir al gimnasio");
		int ingresado = Util.ingresarEntero(1, 3);
		
				switch (ingresado) {
		case 1: {
			mensajeEnConstruccion();
			break;
		}
		case 2: {
			mensajeEnConstruccion();
			break;
		}
		case 3: {
			mG.mostrar();
			break;
		}
		default:
		}
	}
	
	private void mensajeEnConstruccion() {
		System.out.println("Funcionalidad en construccion... vuelva pronto");
	}
}
