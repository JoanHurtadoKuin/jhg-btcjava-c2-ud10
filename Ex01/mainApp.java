package Ex01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		boolean acertar = false;
		int intentos = 0;
		int numero;
	
		//Generamos un numero aleatorio
		NumeroRandom aleatorio = new NumeroRandom();
		System.out.println(aleatorio.getNumAleatorio());
		
		do {
			//Pedimos el numero
			System.out.println("Introduce un numero");
			intentos++;
			
			try {
				numero = sc.nextInt();//Si es un numero correcto
				
				if(numero==aleatorio.getNumAleatorio()) {
					System.out.println("Enhorabuena, has acertado con " + intentos + " intentos");
					acertar = true;
				}else if(numero<aleatorio.getNumAleatorio()) {
					System.out.println("El numero aleatorio es mas grande");
				}else {
					System.out.println("El numero aleatorio es mas pequeño");
				}
				
			} catch (InputMismatchException e) {//Si no introducen un numero correcto
				System.out.println("Opcion incorrecta");
			sc.next();
			}
			
		} while (!acertar);
		
		sc.close();
	}

}
