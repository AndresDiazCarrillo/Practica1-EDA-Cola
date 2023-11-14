package Banco;

import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

import Excepciones.AccionesInsuficientesException;

public class Cartera {
	
	//Atributos
	private Queue<PaqueteAccion> pack;
	private double gananciaTotal;
	
	//método constructor
	public Cartera (Queue<PaqueteAccion> pack, double gananciaTotal) {
		this.pack=pack;
		this.gananciaTotal=gananciaTotal;
	}
	
	//método comprarAccion
	public void CompraAcciones(PaqueteAccion paquete) {
		pack.offer(paquete);	
		}
	
	public void VenderAccion(int cantidad, int precio) throws AccionesInsuficientesException{
		//mientras la cantidad que meto por teclado (la que quiero vender)
		//y la cola no vacía (tengo acciones para vender)
		while (cantidad > 0 && !pack.isEmpty()) {
			
			//saco acciones metidas con todos sus datos y lo guardo en paquete
			PaqueteAccion paquete = pack.peek();
			//a partir de paquete saco el número de acciones y lo guardo en Nacc
			int Nacc = paquete.getNacciones();
			
			//si el número de acciones dispo es menor que la cantidad que quiero vender
			if (Nacc <= cantidad) {
				pack.poll();
				gananciaTotal=gananciaTotal + (precio-paquete.getPrecioAccion())*Nacc;
				cantidad= cantidad-Nacc;
			}
			//if Numero de acciones disponibles > cantidad
			else {
				gananciaTotal= gananciaTotal+ (25-paquete.getPrecioAccion())*cantidad;
				paquete.setNacciones(Nacc-cantidad);
				cantidad=0; 
			}
			
		}
		if (cantidad > 0) {
			throw new AccionesInsuficientesException ("La cantidad de acciones que usted quiere vender supera el número de acciones disponibles!");
			
		}
	
	}
	
	public double GananciaTotal() {
		return gananciaTotal;
	}
	
}