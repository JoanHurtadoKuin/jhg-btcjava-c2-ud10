package Ex02;

public class mainApp {

	public static void main(String[] args) {

		
		try {
			
			System.out.println("Generando excepcion");
			//Lanzamos el throw
			throw new LanzarExcepcion();
			
		} catch (LanzarExcepcion e) {//Captura el throw
			
		e.generarExcepcion(); //Se muestra el mensaje
		
		}
	}

}
