package Banco;

import java.io.IOException;
import java.util.ArrayList;

import Excepciones.NumeroFueraRangoException;
import Banco.Cartera;

public class Main {
	
	public static void gestionMenu() throws NumeroFueraRangoException, IOException {
		int opcion=0;
		do {
			// Mostrar menú
			System.out.println("\nIndique el número de la consulta a realizar: \n");
			System.out.println("1. Comprar acciones");
			System.out.println("2. Vender acciones");
			System.out.println("3. Ganancia de capital hasta el momento");
			System.out.println("4. Salir");
			
			boolean salir = false;
			do {
				try {
					// Comprobando entrada numérica y opción de menú válida
					if (opcion <= 4) {
					salir = true;
					}
				} catch (NumeroFueraRangoException e) {
					System.out.println("Introdujo una opción de menú no válida\nVuelva a intentarlo:");				
				}			
			} while(!salir);
			
			// Llamar al método correspondiente según la opción elegida por el usuario
					switch (opcion) {
						case 1: 
							Cartera.CompraAcciones(PaqueteAccion);
							break;
						case 2:
							Cartera.VenderAccion();
							break;
						case 3:
							;
							break;
						case 4:
							System.out.println("Gracias por usar esta aplicacion...");	
							break;
						}
				} while (opcion <= 4);
			}
}
