package Ex03;

public class mainApp {

	public static void main(String[] args) {

		try {
			System.out.println("Lanzamos la excepcion");
			throw new NumeroRandom();
			
		} catch (NumeroRandom e) {
		System.out.println(e.getNumAleatorio());
		e.esParImpar();
		}
		
		
	}

}
