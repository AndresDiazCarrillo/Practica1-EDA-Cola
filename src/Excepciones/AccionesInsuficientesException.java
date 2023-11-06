package Excepciones;

//clase para controlar el error de acciones agotadas
public class AccionesInsuficientesException extends Exception{
	
	//método constructor
	public AccionesInsuficientesException (String mensaje) {
		super (mensaje);
	}

}