package Ex02;

public class LanzarExcepcion extends Exception{

	private String mensaje;
	
	public LanzarExcepcion() {
		this.mensaje = "ERROR --- LANZANDO EXCEPCION";
	}
	
	
	public void generarExcepcion() {
		
		System.out.println(this.mensaje);
	}

}
