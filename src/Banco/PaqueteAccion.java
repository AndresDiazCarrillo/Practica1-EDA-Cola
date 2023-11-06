package Banco;

public class PaqueteAccion {
	
	//atributos
	private int Nacciones; //cuantas acciones
	private String fechaCompra; //mes
	private int precioAccionCompra; //precio una unidad
	
	//método constructor 
	public PaqueteAccion(int Nacciones, String fechaCompra, int precioAccion) {
		this.Nacciones=Nacciones;
		this.fechaCompra=fechaCompra;
		this.precioAccionCompra=precioAccion;
	}
	
	//getters y setters Nacciones
	public int getNacciones() {
		return Nacciones;
	}
	public void setNacciones(int Nacciones) {
		this.Nacciones=Nacciones;
	}
	
	//getters y setters fechaComrpa
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra=fechaCompra;
	}
	
	//getters y setters precioAccion
	public int getPrecioAccion() {
		return precioAccionCompra;
	}
	public void setPrecioAccion(int precioAccion) {
		this.precioAccionCompra=precioAccion;
	}

}