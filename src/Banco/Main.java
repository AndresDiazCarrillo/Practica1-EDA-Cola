package Banco;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.Queue;

import Excepciones.AccionesInsuficientesException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Queue<PaqueteAccion> cola = new LinkedBlockingDeque<>();
		Cartera cartera = new Cartera(cola, 0.0);
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			// Mostrar menú
			System.out.println("\nIndique el número de la consulta a realizar: \n");
			System.out.println("1. Comprar acciones");
			System.out.println("2. Vender acciones");
			System.out.println("3. Ganancia de capital hasta el momento");
			System.out.println("4. Salir");
			
			int opcion = scanner.nextInt();
			// Llamar al método correspondiente según la opción elegida por el usuario
			try {
				switch (opcion) {
						case 1: 
							System.out.println("¿Cuantas acciones quieres comprar?");
							int accionesCompra = scanner.nextInt();
							System.out.println("Ingrese la fecha de compra:");
							String fechaCompra = scanner.next();
							System.out.println("Ingrese el precio por accion:");
							int precioCompra = scanner.nextInt();
							PaqueteAccion paqueteAccion = new PaqueteAccion(accionesCompra, fechaCompra, precioCompra);
							cartera.CompraAcciones(paqueteAccion);
							break;
						case 2:
							System.out.println("Ingrese la cantidad de acciones a vender:");
							int accionesVenta = scanner.nextInt();
							System.out.println("Ingrese el precio al que quieres vender las acciones:");
							int cantidadVendidas = scanner.nextInt();
							cartera.VenderAccion(accionesVenta, cantidadVendidas);
							break;
						case 3:
							System.out.println("Ganancias totales: $" + cartera.GananciaTotal());
							break;
						case 4:
							System.out.println("Gracias por usar esta aplicacion...");	
							break;
						default:
							System.out.println("Opcion no valida");
						}
			} catch (AccionesInsuficientesException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
