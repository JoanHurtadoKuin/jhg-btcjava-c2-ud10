package Ex05;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamañoArray;
		int tamañoContraseña;
		//Introducir tamaño
		System.out.println("Introduce un tamaño de la array");
		tamañoArray = sc.nextInt();
		System.out.println("Introduce el tamaño de la contraseña");
		tamañoContraseña = sc.nextInt();
		
		Password contraseña[] = new Password[tamañoArray];
		boolean almacenFuerte[] = new boolean[tamañoArray];
		
		for (int i = 0; i < tamañoArray; i++) {
			contraseña[i] = new Password(tamañoContraseña);
			almacenFuerte[i] = contraseña[i].esFuerte();
			
			System.out.print("La contraseña " + contraseña[i].getContraseña());
			
			if(almacenFuerte[i]) {
				System.out.println(" es fuerte");
			}else {
				System.out.println(" no es fuerte");
			}
		}
		sc.close();
	}

}
