package Ex05;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tama�oArray;
		int tama�oContrase�a;
		//Introducir tama�o
		System.out.println("Introduce un tama�o de la array");
		tama�oArray = sc.nextInt();
		System.out.println("Introduce el tama�o de la contrase�a");
		tama�oContrase�a = sc.nextInt();
		
		Password contrase�a[] = new Password[tama�oArray];
		boolean almacenFuerte[] = new boolean[tama�oArray];
		
		for (int i = 0; i < tama�oArray; i++) {
			contrase�a[i] = new Password(tama�oContrase�a);
			almacenFuerte[i] = contrase�a[i].esFuerte();
			
			System.out.print("La contrase�a " + contrase�a[i].getContrase�a());
			
			if(almacenFuerte[i]) {
				System.out.println(" es fuerte");
			}else {
				System.out.println(" no es fuerte");
			}
		}
		sc.close();
	}

}
