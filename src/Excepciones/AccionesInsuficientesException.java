package Excepciones;

//clase para controlar el error de acciones agotadas
public class AccionesInsuficientesException extends Exception{
	
	//m�todo constructor
	public AccionesInsuficientesException (String mensaje) {
		super (mensaje);
	}

}