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
			// Mostrar men�
			System.out.println("\nIndique el n�mero de la consulta a realizar: \n");
			System.out.println("1. Mostrar la informaci�n del contenido de la plataforma");
			System.out.println("2. Realizar promoci�n de pel�cula o serie");
			System.out.println("3. Mostrar todas las promociones realizadas");
			System.out.println("4. Mostrar el coste de las promociones realizadas");
			System.out.println("5. Calcular el coste de promoci�n de una pel�cula o serie");
			System.out.println("6. Calcular el coste de una campa�a masiva de marketing");
			System.out.println("7. Calcular la subvenci�n que se obtiene a partir de las pel�culas o series");
			System.out.println("8. Salir");
			
			boolean salir = false;
			do {
				try {
					// Comprobando entrada num�rica y opci�n de men� v�lida
					opcion = leerDatoRango(1, NUMERO_OPCIONES_MENU);
					salir = true;
				} catch (NumeroFueraRangoException e) {
					System.out.println("Introdujo una opci�n de men� no v�lida\nVuelva a intentarlo:");				
				}			
			} while(!salir);
			
			// Llamar al m�todo correspondiente seg�n la opci�n elegida por el usuario
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
							Netflix.calcularCosteDeCampa�aMarketing(lContenido);
							break;
						case 7:
							Netflix.imprimirSubvencionAyuntamiento(lContenido);
							
							break;
						case 8:
							System.out.println("Gracias por usar esta aplicaci�n ...");
							break;
						}
				} while (opcion != NUMERO_OPCIONES_MENU);
			}


}
