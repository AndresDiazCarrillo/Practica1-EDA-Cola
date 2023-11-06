package Banco;

import java.io.IOException;
import java.util.ArrayList;

import Excepciones.NoEncontradoException;
import Excepciones.NumeroFueraRangoException;
import NETFLIX.Contenido;
import NETFLIX.Netflix;

public class Main {
	
	public static void gestionMenu(Netflix netflix,ArrayList<Contenido> lContenido) throws NoEncontradoException, IOException {
		int opcion=0, nCapitulos=0, nTemporadas = 0;
		boolean tendencia = true;
		do {
			// Mostrar menú
			System.out.println("\nIndique el número de la consulta a realizar: \n");
			System.out.println("1. Mostrar la información del contenido de la plataforma");
			System.out.println("2. Realizar promoción de película o serie");
			System.out.println("3. Mostrar todas las promociones realizadas");
			System.out.println("4. Mostrar el coste de las promociones realizadas");
			System.out.println("5. Calcular el coste de promoción de una película o serie");
			System.out.println("6. Calcular el coste de una campaña masiva de marketing");
			System.out.println("7. Calcular la subvención que se obtiene a partir de las películas o series");
			System.out.println("8. Salir");
			
			boolean salir = false;
			do {
				try {
					// Comprobando entrada numérica y opción de menú válida
					opcion = leerDatoRango(1, NUMERO_OPCIONES_MENU);
					salir = true;
				} catch (NumeroFueraRangoException e) {
					System.out.println("Introdujo una opción de menú no válida\nVuelva a intentarlo:");				
				}			
			} while(!salir);
			
			// Llamar al método correspondiente según la opción elegida por el usuario
					switch (opcion) {
						case 1: 
							Netflix.leerContenido(lContenido);
							break;
						case 2:
							Netflix.crearPromocion(lContenido, tendencia, nCapitulos, nTemporadas);
							break;
						case 3:
							Netflix.mostrarTodasLasPromociones(lContenido);
							
							break;
						case 4:
							Netflix.mostrarcosteTotalPromociones(lContenido);
							
							break;
						case 5:	
							Netflix.calcularCostePromociones(lContenido);
							
							break;
						case 6:
							Netflix.calcularCosteDeCampañaMarketing(lContenido);
							break;
						case 7:
							Netflix.imprimirSubvencionAyuntamiento(lContenido);
							
							break;
						case 8:
							System.out.println("Gracias por usar esta aplicación ...");
							break;
						}
				} while (opcion != NUMERO_OPCIONES_MENU);
			}


}
